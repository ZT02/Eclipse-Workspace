package de.hsc.sose.escaperoom;

import de.hsc.sose.escaperoom.riddle.IRiddle;
import de.hsc.sose.escaperoom.riddle.Riddle;
import de.hsc.sose.game.AbstractGame;
import de.hsc.sose.game.Difficulty;
import de.hsc.sose.interaction.util.InOut;

import java.util.List;

/**
 * Escape room consisting of various {@link IRiddle}
 */
public class EscapeRoom extends AbstractGame {

    private final InOut inOut;
    private final String finalSolution;
    private final List<IRiddle> riddles;
    private int remainingAttempts;

    public EscapeRoom(final Difficulty difficulty, final String finalSolution, final List<IRiddle> riddles) {
        super(difficulty);

        inOut = new InOut();
        remainingAttempts = difficulty.getMaxAttempts();

        this.riddles = riddles;
        this.finalSolution = finalSolution;
    }

    @Override
    public void run() {
        var finalSolutionStartIndex = 0;
        for (int i = 0; i < riddles.size(); i++) {
            inOut.print("Riddle no." + (i + 1));
            if (!solveRiddle(riddles.get(i))) {
                //If riddle was not solved successfully, exit game.
                return;
            }
            inOut.print("RICHTIG! Auf zum nächsten Rätsel!");

            //Print partial solution
            var endIdx = finalSolutionStartIndex + (int) Math.ceil((double) finalSolution.length() / riddles.size());
            if (i == riddles.size() - 1) endIdx = finalSolution.length();
            String partialSolution = finalSolution.substring(finalSolutionStartIndex, endIdx);
            finalSolutionStartIndex = endIdx;
            inOut.print("Du hast einen Teil des finalen Passworts bekommen: " + partialSolution + "\r\n");
        }
        final var finalRiddle = new Riddle<>(inOut, "Was ist die finale Antwort?", finalSolution);
        if (!solveRiddle(finalRiddle)) {
            return;
        }
        inOut.print("Geschafft! Du hast alle Rätsel gelöst und kannst endlich auf die Prüfungsdatei zugreifen." +
                " Damit wird die Prüfung ein Kinderspiel, du ziehst dir die Datei auf einen USB-Stick und verlässt" +
                "unbemerkt und  glücklich das Büro. Sherlock Holmes könnte sich eine Scheibe von dir abschneiden :D");
    }

    /**
     * @param riddle to be solved
     * @return whether lives are remaining
     */
    private boolean solveRiddle(final IRiddle riddle) {
        final var riddleSolved = riddle.showAndSolveRiddle();
        if (!riddleSolved) {
            remainingAttempts--;
            if (remainingAttempts == 0) {
                inOut.print("Du hast verloren!.");
                return false;
            } else {
                inOut.print("Falsche Antwort. Noch verfügbare Leben: " + remainingAttempts);
            }
            solveRiddle(riddle);
        }
        return true;
    }


}

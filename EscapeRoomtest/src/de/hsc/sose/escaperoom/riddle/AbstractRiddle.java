package de.hsc.sose.escaperoom.riddle;

import de.hsc.sose.interaction.output.IOutput;

public abstract class AbstractRiddle<T> implements IRiddle {

    private final IOutput output;

    private final String riddleText;
    private final T solution;

    protected AbstractRiddle(final IOutput output, final String riddleText, final T solution) {
        this.output = output;
        this.riddleText = riddleText;
        this.solution = solution;
    }

    /**
     * @return input from user
     */
    protected abstract T getUserAttempt();

    protected T getSolution() {
        return solution;
    }


    @Override
    public boolean showAndSolveRiddle() {
        presentRiddle();
        final var attemptedSolution = getUserAttempt();
        return isAnswerCorrect(attemptedSolution);
    }

    private void presentRiddle() {
        output.print(riddleText);
    }

    private boolean isAnswerCorrect(final T solution) {
        return this.solution.equals(solution);
    }

}

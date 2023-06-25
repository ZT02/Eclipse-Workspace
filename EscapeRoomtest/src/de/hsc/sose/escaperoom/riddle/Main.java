package de.hsc.sose;

import de.hsc.sose.escaperoom.EscapeRoom;
import de.hsc.sose.escaperoom.riddle.Riddle;
import de.hsc.sose.game.Difficulty;
import de.hsc.sose.interaction.util.InOut;
import de.hsc.sose.escaperoom.riddle.ScrabblerRiddle;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        final var inOut = new InOut();

        final var intro = new Riddle<>(inOut, """
                Du läufst durch die Gänge der Hochschule mit den Gedanken fest auf ein Ziel fixiert: Die Lösungen der kommenden Programmierprüfung zu klauen. Und wo sind diese Lösungen zu finden?\s
                Richtig, im Büro von Professor Pfeiffer. Mittlerweile bei seinem Büro angekommen klopfst du an die Tür und wartest ob du eine Antwort bekommst.
                Nachdem nichts zu hören ist versuchst du vorsichtig die Tür zu öffnen und stellst fest, dass diese nicht abgeschlossen ist.
                Du trittst also ein und blickst dich kurz im Raum um bis dein Blick auf den Laptop von Professor Pfeiffer fällt.
                Du setzt dich auf den Schreibtischstuhl und siehst dass der Laptop an ist und du ohne Probleme darauf zugreifen kannst.
                Du suchst nach der Datei in der sich die Lösungen befinden könnten und nachdem du einige Ordner durchgeklickt hast
                findest du auch eine Datei mit dem Namen 'Prüfung SoSe 22' du klickst drauf und ein Fenster ploppt auf. Die Datei ist Passwortgeschützt...
                Es sieht so aus, als müsstest du mehrere Rätsel Lösen um anschließend an das richtige Passwort für die Datei zu ran zu kommen. \n
                Das erste Rätsel lautet: Ich hab ein eigenes Schloss, doch ist das ziemlich klein. Es passt kein Gast, kein Hausgenoss’ zugleich mit mir hinein. Was ist damit gemeint?"""
                , "Schlüssel");
        final var calculation = new Riddle<>(inOut, "Was ist die größte Zahl eines Ints?", Integer.MAX_VALUE);
        final var scrabblerRiddle = new ScrabblerRiddle(inOut, "INFORMATIK");
        new EscapeRoom(Difficulty.MEDIUM, "KatharinaBorggPinzberg91361", List.of(intro, calculation, scrabblerRiddle)).run();

    }

}

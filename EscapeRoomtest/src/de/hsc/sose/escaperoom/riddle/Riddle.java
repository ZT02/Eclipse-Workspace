package de.hsc.sose.escaperoom.riddle;

import de.hsc.sose.interaction.util.InOut;

import java.util.Arrays;

public class Riddle<T> extends AbstractRiddle<T> {

    private final InOut inOut;

    public Riddle(final InOut inOut, final String riddleText, final T solution) {
        super(inOut, riddleText, solution);
        //throws IllegalargumentException if type of solution is not supported
        if (!Arrays.asList(String.class, Integer.class, Double.class).contains(solution.getClass())) {
            throw new IllegalArgumentException();
        }
        this.inOut = inOut;
    }


    //get user-attempt
    @Override
    protected T getUserAttempt() {
        final Class<?> solutionClass = getSolution().getClass();
        if (String.class.isAssignableFrom(solutionClass)) {
            return (T) inOut.readString();
        } else if (Integer.class.isAssignableFrom(solutionClass)) {
            return (T) ((Integer) inOut.readInt());
        } else if (Double.class.isAssignableFrom(solutionClass)) {
            return (T) ((Double) inOut.readDouble());
        } else {
            throw new IllegalArgumentException();
        }
    }
}

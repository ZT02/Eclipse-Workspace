package de.hsc.sose.interaction.util;

import de.hsc.sose.interaction.input.IInput;
import de.hsc.sose.interaction.input.Input;
import de.hsc.sose.interaction.output.IOutput;
import de.hsc.sose.interaction.output.Output;

/**
 * Handles in- and output operations
 */
public class InOut implements IInput, IOutput {

    private final Input input = new Input();
    private final Output output = new Output();

    @Override
    public int readInt() {
        return input.readInt();
    }

    @Override
    public double readDouble() {
        return input.readDouble();
    }

    @Override
    public String readString() {
        return input.readString();
    }

    @Override
    public void print(final String text) {
        output.print(text);
    }
}

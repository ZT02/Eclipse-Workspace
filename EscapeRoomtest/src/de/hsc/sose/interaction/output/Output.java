package de.hsc.sose.interaction.output;

public class Output implements IOutput {

    @Override
    public void print(final String text) {
        System.out.println(text);
    }

}

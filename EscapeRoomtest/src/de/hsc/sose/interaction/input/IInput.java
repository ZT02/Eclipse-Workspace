package de.hsc.sose.interaction.input;

/**
 * Specifies input operations
 */
public interface IInput {

    /**
     * @return an input value of type {@link Integer}
     */
    int readInt();

    /**
     * @return an input value of type {@link Double}
     */
    double readDouble();

    /**
     * @return an input value of type {@link String}
     */
    String readString();

}

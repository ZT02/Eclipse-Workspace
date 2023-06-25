package de.hsc.sose.game;

/**
 * Specifies base game operations
 */
public interface IGame {

    /**
     * Execute game
     */
    void run();

    Difficulty getDifficulty();

    String toString();

}

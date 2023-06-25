package de.hsc.sose.game;

public abstract class AbstractGame implements IGame {

    private final Difficulty difficulty;

    protected AbstractGame(final Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public Difficulty getDifficulty() {
        return difficulty;
    }

}

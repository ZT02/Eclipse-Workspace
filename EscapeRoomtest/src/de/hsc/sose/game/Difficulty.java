package de.hsc.sose.game;

public enum Difficulty {

    EASY(10), MEDIUM(5), HARD(3), HARDCORE(1);

    private final int maxAttempts;

    Difficulty(final int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }
}

package org.LLD.DesignProblems.SnakeAndLadder;

public class BotPlayingStrategyFactory {

    public BotPlayingStrategy getBotPlayingStrategy(BotDifficultLevel botDifficultLevel) {
        switch (botDifficultLevel) {
            case EASY -> {
                return new BotEasyLevelPlayingStrategy();
            }
            case MEDIUM -> {
                return new BotMediumLevelPlayingStrategy();
            }
            case HARD -> {
                return new BotDiffucultLevelPlayingStrategy();
            }
            default -> throw new IllegalArgumentException("Select correct level");
        }
    }
}

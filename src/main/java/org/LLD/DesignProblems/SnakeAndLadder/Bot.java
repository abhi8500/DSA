package org.LLD.DesignProblems.SnakeAndLadder;

public class Bot extends Player{

    private BotDifficultLevel botDifficultLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(String name, PlayerType playerType, SymbolColor color, String avatar) {
        super(name, playerType, color, avatar);
    }
}

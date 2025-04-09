package org.LLD.DesignProblems.TicTacToe.models;

import org.LLD.DesignProblems.TicTacToe.enums.BotDifficultyLevel;
import org.LLD.DesignProblems.TicTacToe.enums.PlayerType;
import org.LLD.DesignProblems.TicTacToe.stratagies.botDifficultyStrategy.BotDifficultyStrategy;

public class Bot extends  Player{

    private BotDifficultyLevel botDifficultyLevel;
    private BotDifficultyStrategy botDifficultyStrategy;


    public Bot(String name, Symbol symbol) {
        super(name, symbol, PlayerType.BOT);
    }
}

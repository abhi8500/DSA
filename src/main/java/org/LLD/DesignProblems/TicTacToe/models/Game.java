package org.LLD.DesignProblems.TicTacToe.models;

import org.LLD.DesignProblems.TicTacToe.enums.PlayerType;
import org.LLD.DesignProblems.TicTacToe.exceptions.BotCountException;
import org.LLD.DesignProblems.TicTacToe.exceptions.PlayerCountException;
import org.LLD.DesignProblems.TicTacToe.exceptions.UniquePlayerSymbolException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Game {

    private  Board board;

    private List<Player> players;

    private Player winner;

    private List<Move> moves;

    private int nextPlayerIndex;

    private Game(int dimension,List<Player> players){
        this.board = new Board(dimension);
        this.players = players;
        this.winner = null;
        this.moves = new ArrayList<>();
        this.nextPlayerIndex = 0;
    }


    public static Builder getBuilder(){
        return new Builder();
    }


    public static class Builder{

        private int dimension;

        private List<Player> players;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        private void validatePlayerCount() throws PlayerCountException {
            if (players.size() != dimension-1){
                throw new PlayerCountException("Player count is not equal to board dimension -1");
            }
        }

        private void validateBotCount() throws BotCountException {
            int botCount = 0;
            for (Player player : players){
                if (player.getPlayerType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }

            if (botCount == dimension-2){
                throw new BotCountException("No of bots should not be equal to board dimension -2");
            }
        }

        private void validatePlayersUniqueSymbol() throws UniquePlayerSymbolException {

            HashSet<Character> symbols = new HashSet<>();

            for (Player player : players){
                if (symbols.contains(player.getSymbol().getSymbolChar())){
                    throw new UniquePlayerSymbolException("Players should have unique symbol");
                }
            }
        }
        private void validate() throws PlayerCountException, BotCountException, UniquePlayerSymbolException {
            validatePlayerCount();
            validateBotCount();
            validatePlayersUniqueSymbol();
        }

        public Game build(){
            return new Game(dimension,players);
        }
    }
}

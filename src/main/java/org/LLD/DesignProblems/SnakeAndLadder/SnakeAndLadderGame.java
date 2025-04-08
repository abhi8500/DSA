package org.LLD.DesignProblems.SnakeAndLadder;
import java.util.List;

public class SnakeAndLadderGame {

    private Board board;
    private List<Player> players;
    private Dice dice;
    private Player winner;
    private GameStatus gameStatus;
    private List<Move> moves;

    private int currentPlayerIndex;

    public SnakeAndLadderGame(List<Player> players) {
        board = new Board();
        dice = new Dice();
        this.players = players;

        currentPlayerIndex = 0;
    }

    public void play() {
        while (!isGameOver()) {
            Player currentPlayer = players.get(currentPlayerIndex);
            int diceRoll = dice.roll();
            int newPosition = currentPlayer.getCurrentPositionPosition() + diceRoll;

            if (newPosition <= board.getBoardSize()) {
                currentPlayer.setCurrentPosition(board.getNewPositionAfterSnakeOrLadder(newPosition));
                System.out.println(currentPlayer.getName() + " rolled a " + diceRoll +
                        " and moved to position " + currentPlayer.getCurrentPositionPosition());
            }

            if (currentPlayer.getCurrentPositionPosition() == board.getBoardSize()) {
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        }
    }

    private boolean isGameOver() {
        for (Player player : players) {
            if (player.getCurrentPositionPosition() == board.getBoardSize()) {
                return true;
            }
        }
        return false;
    }
}

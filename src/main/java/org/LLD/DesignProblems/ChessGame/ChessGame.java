package org.LLD.DesignProblems.ChessGame;

public class ChessGame {

    private final ChessBoard chessBoard;
    private final Player[] players;
    private int currentPlayer;

    public ChessGame() {
        chessBoard = new ChessBoard();
        players = new Player[]{new Player(Color.WHITE), new Player(Color.BLACK)};
        currentPlayer = 0;
    }

    public void start() {
        // Game loop
        while (!isGameOver()) {
           // Implement logic

            // Switch to the next player
            currentPlayer = (currentPlayer + 1) % 2;
        }

        // Display game result
        displayResult();
    }

    private boolean isGameOver() {
        // Implement logic
        return false;
    }

    private void displayResult() {
       // Implement logic
    }
}

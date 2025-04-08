package org.LLD.DesignProblems.ChessGame.pieces;

import org.LLD.DesignProblems.ChessGame.ChessBoard;
import org.LLD.DesignProblems.ChessGame.Color;


public class Knight extends Piece{

    public Knight(Color color, int row, int col) {
        super(color, row, col);
    }

    @Override
    public boolean canMove(ChessBoard board, int destinationRow, int destinationCol) {
        int rowDiff = Math.abs(destinationRow - row);
        int colDiff = Math.abs(destinationCol - col);
        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }
}

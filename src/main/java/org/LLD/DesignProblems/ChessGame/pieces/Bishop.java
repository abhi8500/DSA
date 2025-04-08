package org.LLD.DesignProblems.ChessGame.pieces;

import org.LLD.DesignProblems.ChessGame.ChessBoard;
import org.LLD.DesignProblems.ChessGame.Color;


public class Bishop extends Piece{

    public Bishop(Color color, int row, int col) {
        super(color, row, col);
    }

    @Override
    public boolean canMove(ChessBoard board, int destinationRow, int destinationCol) {
        int rowDiff = Math.abs(destinationRow - row);
        int colDiff = Math.abs(destinationCol - col);
        return (rowDiff == colDiff);
    }
}

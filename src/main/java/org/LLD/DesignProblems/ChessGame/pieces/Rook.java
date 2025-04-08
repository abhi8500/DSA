package org.LLD.DesignProblems.ChessGame.pieces;

import org.LLD.DesignProblems.ChessGame.ChessBoard;
import org.LLD.DesignProblems.ChessGame.Color;


public class Rook extends Piece{

    public Rook(Color color, int row, int col) {
        super(color, row, col);
    }

    @Override
    public boolean canMove(ChessBoard board, int destinationRow, int destinationCol) {
        return (row == destinationRow || col == destinationCol);
    }
}

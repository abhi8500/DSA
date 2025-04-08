package org.LLD.DesignProblems.ChessGame.pieces;

import org.LLD.DesignProblems.ChessGame.ChessBoard;
import org.LLD.DesignProblems.ChessGame.Color;


public abstract class Piece {

    protected Color color;
    protected int row;
    protected int col;

    public Piece(Color color, int row, int col) {
        this.color = color;
        this.row = row;
        this.col = col;
    }


    public abstract boolean canMove(ChessBoard board, int destinationRow, int destinationCol);

    public Color getColor() {
        return color;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

}

package org.LLD.DesignProblems.ChessGame;

import org.LLD.DesignProblems.ChessGame.pieces.Piece;

import java.util.List;

public class Player {

    private final Color color;
    private List<Piece> pieces;

    public Player(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}

package org.LLD.DesignProblems.TicTacToe.models;

public class Move {

    private Board board;

    private Player player;

    public Move(Board board,Player player){
        this.board = board;
        this.player = player;
    }
}

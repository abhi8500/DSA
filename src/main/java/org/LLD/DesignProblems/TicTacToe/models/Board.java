package org.LLD.DesignProblems.TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int dimension;
    private List<List<Cell>> board;

    public  Board(int dimension){
        this.dimension = dimension;
        this.board = new ArrayList<>();

        for (int i=0;i<dimension;i++){
            this.board.add(new ArrayList<>());
            for (int j=0;j<dimension;j++){
                this.board.get(i).add(new Cell(i,j));
            }
        }
    }
}

package org.LLD.DesignProblems.SnakeAndLadder;

public abstract class Obstacle {

    private final int start;
    private final int end;

    public Obstacle(int start,int end){
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}

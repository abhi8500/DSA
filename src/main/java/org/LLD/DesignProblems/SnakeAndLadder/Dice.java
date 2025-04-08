package org.LLD.DesignProblems.SnakeAndLadder;

public class Dice {

    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE = 6;

    public int roll(){
        return (int) (Math.random() * (MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE);
    }
}

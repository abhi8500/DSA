package org.LLD.DesignPatterns.FlyWeight.chess;


import org.LLD.DesignPatterns.FlyWeight.ExtrinsicState;

@ExtrinsicState
public class UserExtrinsicState {

    private Colour colour;
    private int currentGameStreak;

    private UserIntrinsicState user;

    public Colour getColour() {
        return colour;
    }

    public int getCurrentGameStreak() {
        return currentGameStreak;
    }
}

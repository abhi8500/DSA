package org.LLD.DesignPatterns.Structural.FlyWeight.chess;


import org.LLD.DesignPatterns.Structural.FlyWeight.ExtrinsicState;

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

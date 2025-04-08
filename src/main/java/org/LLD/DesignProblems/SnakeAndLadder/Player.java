package org.LLD.DesignProblems.SnakeAndLadder;

public class Player {

    private String name;
    private int currentPosition;
    private Symbol symbol;
    private PlayerType playerType;

    public Player(String name, PlayerType playerType,
                  SymbolColor color, String avatar) {
        this.playerType = playerType;
        this.name = name;
        this.symbol = new Symbol(color, avatar);
        this.currentPosition = 0;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPositionPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}

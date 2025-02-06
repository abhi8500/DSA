package org.LLD.InterfaceAndAbstract.ShapesCS;

public abstract class Shape {

    /// Data members
    private int positionX;

    private int positionY;

    private String fillColor;

    private String borderColor;

    /// All Arg Constructor
    public Shape(int positionX, int positionY, String fillColor, String borderColor) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    /// Getters
    public int getPositionX() {
        return this.positionX;
    }

    public int getPositionY() {
        return this.positionY;
    }

    public String getFillColor() {
        return this.fillColor;
    }

    public String getBorderColor() {
        return this.borderColor;
    }

    /// Behaviour
    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}

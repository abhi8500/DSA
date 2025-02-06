package org.LLD.InterfaceAndAbstract.ShapesCS;

public class Rectangle extends Shape {

    /// Data Members
    private int width;

    private int height;

    /// All args constructor
    public Rectangle(int positionX, int positionY, String fillColor, String borderColor, int width, int height) {
        super(positionX, positionY, fillColor, borderColor);
        this.width = width;
        this.height = height;
    }

    /// Getters
    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    /// Behaviour Implementations
    @Override
    public double calculateArea(){
        return (double) this.width*this.height;

    }

    @Override
    public double calculatePerimeter(){
        return (double) 2 * (this.width+this.height);
    }


}

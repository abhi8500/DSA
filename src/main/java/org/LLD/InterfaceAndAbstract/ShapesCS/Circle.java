package org.LLD.InterfaceAndAbstract.ShapesCS;

public class Circle extends Shape {


    /// Data Members
    private int radius;


    /// All args constructor
    public Circle(int positionX, int positionY, String fillColor, String borderColor, int radius) {
        super(positionX, positionY, fillColor, borderColor);
        this.radius = radius;
    }

    /// Getters
    public int getRadius() {
        return this.radius;
    }

    ///  Method Implementations
    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2* Math.PI*radius;
    }
}

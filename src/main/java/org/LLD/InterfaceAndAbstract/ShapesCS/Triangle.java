package org.LLD.InterfaceAndAbstract.ShapesCS;

public class Triangle extends Shape {

    /// Data Members
    private int side1;

    private int side2;

    private int side3;

    /// All args constructor
    public Triangle(int positionX,int positionY,String fillColor,String borderColor,int side1,int side2,int side3){
        super(positionX,positionY,fillColor,borderColor);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    /// Getters
    public int getSide1(){
        return this.side1;
    }

    public int getSide2(){
        return this.side2;
    }

    public int getSide3(){
        return this.side3;
    }

    /// Method implementations
    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3)/ 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

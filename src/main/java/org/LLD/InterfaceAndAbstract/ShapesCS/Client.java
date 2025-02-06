package org.LLD.InterfaceAndAbstract.ShapesCS;

public class Client {

    public static void main(String[] args){

        Shape s = new Circle(1,2,"Red","Black",20);

        System.out.println("Area of the shape is : "+s.calculateArea());
        System.out.println("Perimeter of the shape is "+s.calculatePerimeter());
    }
}

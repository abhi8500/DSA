package org.LLD.DesignPatterns.Strategy.duckInterfaceDesign;

public class MallardDuck extends Duck  implements Flyable,Quackable{

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }

    @Override
    public void fly() {
        System.out.println("Mallard duck is flying");
    }

    @Override
    public void quack() {
        System.out.println("Mallard duck is quacking");
    }
}

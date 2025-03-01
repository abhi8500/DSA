package org.LLD.DesignPatterns.Problems.duckInterfaceDesign;

public class RedHeadDuck extends Duck implements Flyable,Quackable {

    @Override
    public void display() {
        System.out.println("Red head Duck");
    }

    @Override
    public void fly() {
        System.out.println("Red head duck is flying");
    }

    @Override
    public void quack() {
        System.out.println("Red head duck is quacking");
    }
}

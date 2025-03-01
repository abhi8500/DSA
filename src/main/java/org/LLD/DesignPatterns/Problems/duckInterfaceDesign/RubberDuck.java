package org.LLD.DesignPatterns.Problems.duckInterfaceDesign;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }

    @Override
    public void quack() {
        System.out.println("Rubber duck is quacking");
    }
}

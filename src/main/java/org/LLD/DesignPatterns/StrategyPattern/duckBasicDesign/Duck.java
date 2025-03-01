package org.LLD.DesignPatterns.StrategyPattern.duckBasicDesign;

public abstract class Duck {

    public void swim() {
        System.out.println("Duck swims");
    }

    public abstract void display();

    public void quack() {
        System.out.println("Duck quacks");
    }


    public void fly() {
        System.out.println("Duck flies");
    }
}

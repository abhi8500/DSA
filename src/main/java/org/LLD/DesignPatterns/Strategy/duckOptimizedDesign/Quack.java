package org.LLD.DesignPatterns.Strategy.duckOptimizedDesign;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}

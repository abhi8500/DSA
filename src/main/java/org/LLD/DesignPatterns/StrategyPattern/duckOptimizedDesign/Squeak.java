package org.LLD.DesignPatterns.StrategyPattern.duckOptimizedDesign;

public class Squeak implements QuackBehaviour{


    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}

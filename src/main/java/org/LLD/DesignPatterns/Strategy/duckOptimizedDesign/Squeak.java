package org.LLD.DesignPatterns.Strategy.duckOptimizedDesign;

public class Squeak implements QuackBehaviour{


    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}

package org.LLD.DesignPatterns.Behavioural.Strategy.duckOptimizedDesign;

public class Squeak implements QuackBehaviour{


    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}

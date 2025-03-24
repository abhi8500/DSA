package org.LLD.DesignPatterns.Behavioural.Strategy.duckOptimizedDesign;

public class FlyWithWings implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}

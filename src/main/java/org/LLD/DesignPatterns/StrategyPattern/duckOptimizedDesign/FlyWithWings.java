package org.LLD.DesignPatterns.StrategyPattern.duckOptimizedDesign;

public class FlyWithWings implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}

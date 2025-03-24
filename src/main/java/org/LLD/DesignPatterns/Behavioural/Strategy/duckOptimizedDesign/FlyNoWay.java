package org.LLD.DesignPatterns.Behavioural.Strategy.duckOptimizedDesign;

public class FlyNoWay implements FlyBehaviour{


    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}

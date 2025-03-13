package org.LLD.DesignPatterns.Strategy.duckOptimizedDesign;

public class MuteQuack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("<<Silent>>");
    }
}

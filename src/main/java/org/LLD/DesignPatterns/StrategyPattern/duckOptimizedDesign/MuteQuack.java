package org.LLD.DesignPatterns.StrategyPattern.duckOptimizedDesign;

public class MuteQuack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("<<Silent>>");
    }
}

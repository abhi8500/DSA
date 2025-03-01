package org.LLD.DesignPatterns.Problems.duckOptimizedDesign;

public class MuteQuack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("<<Silent>>");
    }
}

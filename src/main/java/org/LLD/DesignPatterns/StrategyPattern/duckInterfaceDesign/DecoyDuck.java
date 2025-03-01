package org.LLD.DesignPatterns.StrategyPattern.duckInterfaceDesign;

public class DecoyDuck extends Duck{

    @Override
    public void display() {
        System.out.println("Decoy Duck");
    }
}

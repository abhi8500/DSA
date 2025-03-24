package org.LLD.DesignPatterns.Behavioural.Strategy.duckInterfaceDesign;

public class DecoyDuck extends Duck{

    @Override
    public void display() {
        System.out.println("Decoy Duck");
    }
}

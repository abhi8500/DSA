package org.LLD.DesignPatterns.Strategy.duckOptimizedDesign;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyable = new FlyWithWings();
        quackable = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }

}

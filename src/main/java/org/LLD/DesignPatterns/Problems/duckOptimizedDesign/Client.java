package org.LLD.DesignPatterns.Problems.duckOptimizedDesign;

public class Client {

    public static void main(String[] args) {

        ///  Problems

        /// We should not program to an
        /// implementation. But what are we doing in that constructor? We’re making a
        /// new instance of a concrete Quack implementation class!

        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.setFlyable(new FlyNoWay());
        duck.performFly();
        duck.performQuack();
        duck.swim();

    }
}

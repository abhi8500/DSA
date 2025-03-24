package org.LLD.DesignPatterns.Behavioural.Strategy.duckOptimizedDesign;

public class Client {

    public static void main(String[] args) {

        ///  Problems

        /// We should not program to an
        /// implementation. But what are we doing in that constructor? We’re making a
        /// new instance of a concrete Quack implementation class!

        /// This is the implementation of strategy design pattern
        /// The Strategy Pattern defines a family of algorithms,
        /// encapsulates each one, and makes them interchangeable.
        /// Strategy lets the algorithm vary independently from clients that use it

        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.setFlyable(new FlyNoWay());
        duck.performFly();
        duck.performQuack();
        duck.swim();

    }
}

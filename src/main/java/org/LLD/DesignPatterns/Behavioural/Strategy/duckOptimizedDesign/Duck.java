package org.LLD.DesignPatterns.Behavioural.Strategy.duckOptimizedDesign;


public abstract class Duck {

    /// Both flyable and quackable are having HAS-A relationship in the Duck class
    FlyBehaviour flyable;
    QuackBehaviour quackable;

    public Duck() {

    }

    /// To change behaviours at runtime
    public void setFlyable(FlyBehaviour flyable){
        this.flyable = flyable;
    }

    public void setQuackable(QuackBehaviour quackable){
        this.quackable = quackable;
    }

    public void performFly() {
        flyable.fly();
    }

    public void performQuack() {
        quackable.quack();
    }

    public void swim() {
        System.out.println("Duck swims");
    }

    public abstract void display();

}

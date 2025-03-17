package org.LLD.SOLID.BirdV5;

public class Sparrow extends BirdV5 implements Flyable {

    FlyingBehaviour fl = new FlyLow();

    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
        fl.makeFly();
    }
}

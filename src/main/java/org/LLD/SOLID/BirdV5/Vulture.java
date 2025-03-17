package org.LLD.SOLID.BirdV5;

public class Vulture extends BirdV5 implements Flyable {
    FlyingBehaviour fh = new FlyHigh();

    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
        fh.makeFly();
    }
}

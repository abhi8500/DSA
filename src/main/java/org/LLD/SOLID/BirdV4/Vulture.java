package org.LLD.SOLID.BirdV4;

public class Vulture extends BirdV4 implements Flyable {
    FlyHigh fh = new FlyHigh();

    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
        fh.flyhigh();
    }
}

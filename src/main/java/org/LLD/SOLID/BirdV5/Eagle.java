package org.LLD.SOLID.BirdV5;

public class Eagle extends BirdV5 implements Flyable {

    private FlyingBehaviour fh;

    Eagle(FlyingBehaviour fh){
        this.fh = fh;
    }

    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
        fh.makeFly();
    }
}

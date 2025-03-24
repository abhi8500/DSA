package org.LLD.DesignPatterns.Creational.Factory.Concept;

public class PrincipleFactoryMethodImpl implements UserFactoryMethod{

    @Override
    public User createUser() {
        return new Principle("John","Doe");
    }
}

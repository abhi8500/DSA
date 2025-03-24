package org.LLD.DesignPatterns.Creational.Factory.Concept;

public class StudentFactoryMethodImpl implements UserFactoryMethod{

    @Override
    public User createUser() {
        return new Student("John","Doe");
    }
}

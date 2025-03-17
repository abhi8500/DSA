package org.LLD.DesignPatterns.Factory.Concept;

public class TeacherFactoryMethodImpl implements UserFactoryMethod{

    @Override
    public User createUser() {
        return new Teacher("John","Doe");
    }
}

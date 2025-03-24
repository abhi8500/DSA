package org.LLD.DesignPatterns.Creational.Singleton.concept;

public class ExposingBlockingObjectEager {


    private static ExposingBlockingObjectEager instance = new ExposingBlockingObjectEager();

    private ExposingBlockingObjectEager() {
    }

    /**
     * As no other class can create object to this class we have to expose the instance
     * which is private through getter method and static.
     * The problem with this approach is the object is created eagerly means before any class calls for
     * the object JVM creates the object , which will make the memory boated with unnecessary objects.
     * @return The instance of the class
     */
    public static ExposingBlockingObjectEager getInstance() {
        return instance;
    }
}

package org.LLD.DesignPatterns.Singleton.concept;

public class SynchronizedSingleton {

    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {

    }


    /**
     * This approach will create only 1 object lazily and thread safe, but the problem with
     * It makes all classes which are accessing the singleton object to synchronize.
     * @return The singleton object created
     */
    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }

        return instance;
    }
}

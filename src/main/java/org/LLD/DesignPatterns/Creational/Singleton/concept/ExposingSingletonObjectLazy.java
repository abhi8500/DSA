package org.LLD.DesignPatterns.Creational.Singleton.concept;

public class ExposingSingletonObjectLazy {

    private static ExposingSingletonObjectLazy instance;

    private ExposingSingletonObjectLazy() {

    }


    /**
     * This approach will create only 1 object lazily, but the problem with
     * current approach is that ,this approach is not thread safe.
     * If multiple threads accessing the below approach will not ensure singleton object
     * for first multiple threads
     * @return The singleton object created
     */
    public static ExposingSingletonObjectLazy getInstance() {
        if (instance == null) {
            instance = new ExposingSingletonObjectLazy();
        }

        return instance;
    }
}

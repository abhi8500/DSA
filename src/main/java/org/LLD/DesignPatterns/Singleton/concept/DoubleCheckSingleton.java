package org.LLD.DesignPatterns.Singleton.concept;

public class DoubleCheckSingleton {

    private static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {

    }


    /**
     * This approach will create only 1 object lazily and thread safe,as we are using double check locking mechanism
     * But the problem with this approach when any client deserialize the object then it will create duplicate instance
     * @return The singleton object created
     */
    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}

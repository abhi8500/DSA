package org.LLD.DesignPatterns.Singleton.concept;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializableSingleton  implements Serializable {

    private static SerializableSingleton instance;

    private SerializableSingleton() {

    }


    /**
     * This approach will create only 1 object lazily and thread safe,as we are using double check locking mechanism and readResolve will call getInstance again and
     * blocks duplicate object creation .But the problem is with reflections as reflection can access the private variables and methods ,it will change the whole behaviour.
     * @return The singleton object created
     */
    public static SerializableSingleton getInstance() {
        if (instance == null) {
            synchronized (SerializableSingleton.class) {
                if (instance == null) {
                    instance = new SerializableSingleton();
                }
            }
        }
        return instance;
    }

    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }
}

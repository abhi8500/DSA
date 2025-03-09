package org.LLD.DesignPatterns.Singleton.concept;

public class BlockingObject {

    /**
     * <p>
     *     As we make the default constructor private , no one can call the constructor of the class.
     *     So we blocked the creating of objects for the class.But our aim to create the singleton object is not achieved
     *     as it not allowing others to create at least one object.
     * </p>
     */
    private BlockingObject(){

    }
}

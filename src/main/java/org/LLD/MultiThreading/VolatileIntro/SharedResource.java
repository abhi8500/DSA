package org.LLD.MultiThreading.VolatileIntro;

public class SharedResource {


    /**
     * The volatile keyword is used as modifier for class variables.
     * It's an indicator that this variable's value may be changed by multiple
     * threads.
     * This modifier ensures that the variable is always read from, and written to the
     * main memory, rather than from any thread-specific cache.
     * This provides memory consistency for this variables value across threads.
     * Volatile doesn't gurantee atomicicty.
     *
     * However, volatile does not provide atomicity or synchronization, so additional
     * synchronization mechanisms should be used in conjunction with it when necessary.
     * When to use volatile
     * When a variable is used to track the state of a shared resource, such as
     * counter or a flag.
     * When a varaible is used to communicate between threads.
     * When not use volatile
     * When the variable is used by single thread.
     * When a variable is used to store a large amount of data.
     */
    private volatile boolean flag;

    public SharedResource(){
        this.flag = false;
    }

    /// Toggle method
    public void toggleFlag(){
        flag = !flag;
    }

    /// Getter
    public boolean getFlag(){
        return this.flag;
    }
}

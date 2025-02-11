package org.LLD.MultiThreading.VolatileIntro;

public class SharedResource {

    /// If a variable is volatile then all thread uses the variable from heap rather the thread cache
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

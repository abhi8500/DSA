package org.LLD.DesignPatterns.Factory.Concept;

public class Android extends Platform{
    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidComponentFactory();
    }
}

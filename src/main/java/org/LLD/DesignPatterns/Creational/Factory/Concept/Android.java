package org.LLD.DesignPatterns.Creational.Factory.Concept;

public class Android extends Platform{
    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidComponentFactory();
    }
}

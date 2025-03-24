package org.LLD.DesignPatterns.Creational.Factory.Concept;

public class IOS extends Platform{
    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new IOSComponentFactory();
    }
}

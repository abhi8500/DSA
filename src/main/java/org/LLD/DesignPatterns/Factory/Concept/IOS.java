package org.LLD.DesignPatterns.Factory.Concept;

public class IOS extends Platform{
    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new IOSComponentFactory();
    }
}

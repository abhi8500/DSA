package org.LLD.DesignPatterns.Factory.Concept;

public abstract class Platform {
    public void setRefreshRate(){

    }

    public void setTheme(){

    }

    public static Platform getPlatform(String Platform){
        return PlatformFactory.getPlatform(Platform);
    }


    public abstract UIComponentFactory createUIComponentFactory();
}
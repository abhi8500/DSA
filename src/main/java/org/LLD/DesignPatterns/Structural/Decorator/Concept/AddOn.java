package org.LLD.DesignPatterns.Structural.Decorator.Concept;

public  abstract  class AddOn implements Beverage{

    Beverage b;

    AddOn(Beverage b){
        this.b = b;
    }
}

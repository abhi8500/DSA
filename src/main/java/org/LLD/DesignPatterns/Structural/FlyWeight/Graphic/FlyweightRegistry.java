package org.LLD.DesignPatterns.Structural.FlyWeight.Graphic;

public interface FlyweightRegistry {

    void addFlyweight(GraphicIntrinsicState flyweight);

    GraphicIntrinsicState getFlyweight(GraphicType graphicType);
}

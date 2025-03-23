package org.LLD.DesignPatterns.FlyWeight.Graphic;

public interface FlyweightRegistry {

    void addFlyweight(GraphicIntrinsicState flyweight);

    GraphicIntrinsicState getFlyweight(GraphicType graphicType);
}

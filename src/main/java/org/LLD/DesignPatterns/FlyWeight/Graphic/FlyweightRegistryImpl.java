package org.LLD.DesignPatterns.FlyWeight.Graphic;

import java.util.HashMap;
import java.util.Map;

public class FlyweightRegistryImpl implements FlyweightRegistry{

    Map<GraphicType,GraphicIntrinsicState> graphicsMap = new HashMap<>();

    @Override
    public void addFlyweight(GraphicIntrinsicState flyweight) {
        graphicsMap.put(flyweight.getType(),flyweight);
    }

    @Override
    public GraphicIntrinsicState getFlyweight(GraphicType graphicType) {
        return graphicsMap.get(graphicType);
    }
}

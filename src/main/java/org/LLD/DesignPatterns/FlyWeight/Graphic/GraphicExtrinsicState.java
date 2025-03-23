package org.LLD.DesignPatterns.FlyWeight.Graphic;

import org.LLD.DesignPatterns.FlyWeight.ExtrinsicState;

@ExtrinsicState
public class GraphicExtrinsicState {
    private int x, y;


    private GraphicIntrinsicState intrinsicState;


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

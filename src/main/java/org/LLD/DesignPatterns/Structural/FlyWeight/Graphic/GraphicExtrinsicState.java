package org.LLD.DesignPatterns.Structural.FlyWeight.Graphic;

import org.LLD.DesignPatterns.Structural.FlyWeight.ExtrinsicState;

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

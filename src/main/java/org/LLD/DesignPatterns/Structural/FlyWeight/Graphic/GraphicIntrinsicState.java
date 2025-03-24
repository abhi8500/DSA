package org.LLD.DesignPatterns.Structural.FlyWeight.Graphic;


import org.LLD.DesignPatterns.Structural.FlyWeight.IntrinsicState;

@IntrinsicState
public class GraphicIntrinsicState {

    private GraphicType type;
    private Image image;
    private int width, height;
    private String color;

    public GraphicType getType() {
        return type;
    }

    public Image getImage() {
        return image;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
}

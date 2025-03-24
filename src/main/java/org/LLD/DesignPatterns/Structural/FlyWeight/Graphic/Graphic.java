package org.LLD.DesignPatterns.Structural.FlyWeight.Graphic;

public class Graphic {

    private GraphicType type; // "text" or "image"
    private Image image; // Text content or image file path
    private int x, y; // Coordinates
    private int width, height; // Dimensions
    private String color; // Font color for text or image format for images

    public Graphic(GraphicType type, Image image, int x, int y, int width, int height, String color) {
        this.type = type;
        this.image = image;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public GraphicType getType() {
        return type;
    }

    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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

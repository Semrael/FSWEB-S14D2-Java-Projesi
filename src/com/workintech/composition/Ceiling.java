package com.workintech.composition;

public class Ceiling {
    private int height;
    private PaintColor paintedColor;

    public Ceiling(int height, PaintColor color) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }
    public void create(int height, PaintColor color){
        System.out.println("Ceiling created with height: " + height + ", painted color: " + paintedColor);
    }

}

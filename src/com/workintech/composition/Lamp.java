package com.workintech.composition;

import java.util.PrimitiveIterator;

public class Lamp {
    private LampType style;
    private boolean battery;
    private int globalRating;

    public Lamp(LampType style, boolean battery, int globalRating) {
        this.style = style;
        this.battery = battery;
        this.globalRating = globalRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }
    public LampType getStyle() {
        return style;
    }
     public boolean isBattery(boolean battery){
        return this.battery;
     }

    public int getGlobalRating() {
        return this.globalRating;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "style=" + style +
                ", battery=" + battery +
                ", globalRating=" + globalRating +
                '}';
    }
}

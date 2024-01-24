package com.workintech.composition;

public class Bedroom {
    private String name;
    private Wall wall1,wall2,wall3,wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Carpet carpet;

    private Wardrobe wardrope;
    public Bedroom(String name, Wall wall1,
                  Wall wall2, Wall wall3,
                  Wall wall4, Ceiling ceiling,
                   Bed bed, Carpet carpet, Wardrobe wardrope) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.carpet = carpet;
        this.wardrope=wardrope;
    }

    public Bedroom(String fg, Wall kuzey, Wall güney, Wall doğu, Wall batı, Lamp lamp, Bed çiçekli, Wardrobe wardrobe, Ceiling ceiling, Carpet carpet) {
    }

    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Wardrobe getWardrope() {
        return wardrope;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + name + '\'' +
                ", wall1=" + wall1 +
                ", wall2=" + wall2 +
                ", wall3=" + wall3 +
                ", wall4=" + wall4 +
                ", ceiling=" + ceiling +
                ", bed=" + bed +
                ", carpet=" + carpet +
                ", wardrope=" + wardrope +
                '}';
    }
}

package com.theironyardcharlotte;

/**
 * Created by mfahrner on 8/2/16.
 */
public class Tree {
    String type;
    String color;
    boolean hasLeaves;
    int age;
    boolean hasFruit;

    public Tree(String type, String color, boolean hasLeaves, int age, boolean hasFruit) {
        this.type = type;
        this.color = color;
        this.hasLeaves = hasLeaves;
        this.age = age;
        this.hasFruit = hasFruit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("black")) {
            System.err.println("tree is probably dead!");
        } else {
            this.color = color;
        }
    }

    public boolean isHasLeaves() {
        return hasLeaves;
    }

    public void setHasLeaves(boolean hasLeaves) {
        this.hasLeaves = hasLeaves;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasFruit() {
        return hasFruit;
    }

    public void setHasFruit(boolean hasFruit) {
        this.hasFruit = hasFruit;
    }
}

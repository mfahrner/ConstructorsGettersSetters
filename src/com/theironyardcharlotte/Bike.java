package com.theironyardcharlotte;

/**
 * Created by mfahrner on 8/2/16.
 */
public class Bike {
    private String type;
    private int wheelSize;
    private int numberOfGears;
    private String color;
    private int weight;

    public Bike(String type, int wheelSize, int numberOfGears, String color, int weight) {
        this.type = type;
        this.wheelSize = wheelSize;
        this.numberOfGears = numberOfGears;
        this.color = color;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 0) {
            System.err.println("Invalid weight");
        } else {
            this.weight = weight;
        }

    }
}

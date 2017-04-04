package com.theironyardcharlotte;

/**
 * Created by mfahrner on 8/2/16.
 */
public class Runner {
    String name;
    double height;
    int weight;
    int speed;
    double time;


    public Runner(String name, double height, int weight, int speed, double time) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight <= 0){
            System.err.println("invalid weight");
        } else {
            this.weight = weight;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}


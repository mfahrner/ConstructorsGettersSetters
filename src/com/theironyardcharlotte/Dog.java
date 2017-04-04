package com.theironyardcharlotte;

/**
 * Created by mfahrner on 8/2/16.
 */
public class Dog {
    String name;
    String breed;
    String color;
    boolean isNice;
    boolean isObedient;



    public Dog(String name, String breed, String color, boolean isNice, boolean isObedient) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.isNice = isNice;
        this.isObedient = isObedient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNice() {
        return isNice;
    }

    public void setNice(boolean nice) {
        isNice = nice;
    }

    public boolean isObedient() {
        return isObedient;
    }

    public void setObedient(boolean obedient) {
        if (isObedient == false){
            System.err.println("your dog needs some training SUCKA!");
        } else {
            this.isObedient = obedient;
        }
    }
}

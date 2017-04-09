package com.theironyardcharlotte;

/**
 * Created by mfahrner on 8/2/16.
 */
public class Door {
    private int height;
    private int width;
    private boolean opens;
    private String color;
    private boolean isCreaky;

    public Door(int height, int width, boolean opens, String color, boolean isCreaky) {
        this.height = height;
        this.width = width;
        this.opens = opens;
        this.color = color;
        this.isCreaky = isCreaky;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isOpens() {
        return opens;
    }

    public void setOpens(boolean opens) {
        if (opens == false ) {
            System.err.println("you are locked out sucka!");
        } else {
            this.opens = opens;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCreaky() {
        return isCreaky;
    }

    public void setCreaky(boolean creaky) {
        isCreaky = creaky;
    }
}

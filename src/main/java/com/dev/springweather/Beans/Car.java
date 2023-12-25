package com.dev.springweather.Beans;

public class Car {
    private String color;
    private String type;

    public Car(String color, String type) {
        this.color = color;
        this.type = type;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return this.color;
    }

    public String getType() {
        return this.type;
    }
}

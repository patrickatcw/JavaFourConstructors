package com.me;

public class Car {

    private int year;
    private String manufacturer;
    private String model;
    private String color;

    public Car() {
    }

    public Car(int year, String manufacturer) {
        this.year = year;
        this.manufacturer = manufacturer;
    }

    public Car(int year, String manufacturer, String model) {
        this.year = year;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Car(int year, String manufacturer, String model, String color) {
        this.year = year;
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}

package com.mydeveloperplanet.mylambdaplanet;

/**
 * Business object representing a car
 */
public class Car {

    private String brand;

    private String type;

    private int buildYear;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public void printCar() {
        System.out.println("Car is " + this.getBrand());
    }
}

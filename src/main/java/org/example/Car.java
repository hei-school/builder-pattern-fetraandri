package org.example;

public class Car {


    private boolean hasGPS;
    private boolean hasTripComputer;
    private int numberOfSeats;
    private Engine engine;
    private String color;
    private String model;

    public boolean hasTripComputer() {
        return hasTripComputer;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean hasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    public void setHasTripComputer(boolean hasTripComputer) {
        this.hasTripComputer = hasTripComputer;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return color;
    }

    @Override
    public String toString() {
        return "main.java.org.example.Car{" +
                "hasGPS=" + hasGPS +
                ", hasTripComputer=" + hasTripComputer +
                ", numberOfSeats=" + numberOfSeats +
                ", engine=" + engine +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

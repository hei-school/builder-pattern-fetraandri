package org.example;


public class CarManualBuilder implements Builder {
    private Manual manual;

    CarManualBuilder() {
        this.reset();
    }

    public void reset() {
        this.manual = new Manual();
    }

    public void setSeats(int seats) {
    }

    public void setEngine(Engine engine) {
    }

    public void setTripComputer(boolean tripComputer) {
    }

    public void setGPS(boolean gps) {
    }

    public void setColor(String color) {
    }

    public void setModel(String model) {
    }

    public Manual getProduct() {
        Manual product = this.manual;
        this.reset();
        return product;
    }
}

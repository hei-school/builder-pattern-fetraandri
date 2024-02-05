package org.example;

public class CarBuilder implements Builder {
    private Car car;

    CarBuilder() {
        this.reset();
    }

    public void reset() {
        this.car = new Car();
    }

    public void setSeats(int seats) {
        this.car.setNumberOfSeats(seats);
    }

    public void setEngine(Engine engine) {
        this.car.setEngine(engine);
    }

    public void setTripComputer(boolean tripComputer) {
        this.car.setHasTripComputer(tripComputer);
    }

    public void setGPS(boolean gps) {
        this.car.setHasGPS(gps);
    }

    public void setColor(String color) {
        this.car.setColor(color);
    }

    public void setModel(String model) {
        this.car.setModel(model); // Assurez-vous que le modèle est correctement attribué
    }

    public Car getProduct() {
        Car product = this.car;
        this.reset();
        return product;
    }
}

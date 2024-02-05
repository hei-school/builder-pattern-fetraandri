package org.example;

public class Director {
    void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new Engine());
        builder.setTripComputer(true);
        builder.setGPS(true);
    }
}

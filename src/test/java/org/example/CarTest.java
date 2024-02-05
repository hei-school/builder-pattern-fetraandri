package org.example;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CarTest {
    @Test
    public void testMakeSportsCar() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.constructSportsCar(carBuilder);
        carBuilder.setColor("Red");
        carBuilder.setModel("Tesla Model S");
        Car car = carBuilder.getProduct();

        assertNotNull(car);
    }

    @Test
    public void testMakeSUV() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.constructSportsCar(carBuilder); // We'll use constructSportsCar for SUV for example
        carBuilder.setColor("Blue");
        carBuilder.setModel("Toyota RAV4");
        Car car = carBuilder.getProduct();

        assertNotNull(car);
    }

    @Test
    public void testCarManual() {
        Director director = new Director();
        CarManualBuilder carManualBuilder = new CarManualBuilder();

        director.constructSportsCar(carManualBuilder);
        carManualBuilder.setColor("Red");
        carManualBuilder.setModel("Tesla Model S");
        Manual manual = carManualBuilder.getProduct();

        assertNotNull(manual);
    }

    @Test
    public void testCustomCar() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.constructSportsCar(carBuilder);
        carBuilder.setColor("Green");
        carBuilder.setModel("Custom Car");
        carBuilder.setSeats(4);
        carBuilder.setGPS(false);
        Car car = carBuilder.getProduct();

        assertNotNull(car);
    }

    @Test
    public void testCustomCarManual() {
        Director director = new Director();
        CarManualBuilder carManualBuilder = new CarManualBuilder();

        director.constructSportsCar(carManualBuilder);
        carManualBuilder.setColor("Green");
        carManualBuilder.setModel("Custom Car");
        carManualBuilder.setSeats(4);
        carManualBuilder.setGPS(false);
        Manual manual = carManualBuilder.getProduct();

        assertNotNull(manual);
    }
}

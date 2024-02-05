[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/eYTuOlgZ)

# Builder Pattern Example (CAR)

This project is an example of implementing the Builder design pattern in Java for building cars and car manuals.

## Project Structure

The project is structured as follows:

- `src/`: Folder containing the Java source code.
    - `Main.java`: Main class containing the `main()` method to test the Builder pattern.
    - `Car.java`: Class defining the structure of a car.
    - `Manual.java`: Class defining the structure of a car manual.
    - `Engine.java`: Class defining the structure of an engine.
    - `Builder.java`: Interface defining the methods of the builder.
    - `CarBuilder.java`: Implementation of the builder to construct cars.
    - `CarManualBuilder.java`: Implementation of the builder to construct car manuals.
    - `Director.java`: Director class responsible for executing the construction steps.

## How to Run

1. Make sure you have Java installed on your system.
2. Clone this repository to your local machine.
3. Open the project in your preferred IDE. Recommended (INTELLIJ)
4. Run the `Main.java` class to test the Builder pattern implementation.

## Example Usage

In the `Main.java` class, the `makeCar()` method is used to create a sports car and its corresponding car manual using the Builder pattern. The details of the car and manual are then displayed.

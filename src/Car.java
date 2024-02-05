public class Car {
    private boolean hasGPS;
    private boolean hasTripComputer;
    private int numberOfSeats;
    private Engine engine;
    private String color;
    private String model;

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

    @Override
    public String toString() {
        return "Car{" +
                "hasGPS=" + hasGPS +
                ", hasTripComputer=" + hasTripComputer +
                ", numberOfSeats=" + numberOfSeats +
                ", engine=" + engine +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

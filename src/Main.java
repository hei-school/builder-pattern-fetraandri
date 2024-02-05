public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();

        director.constructSportsCar(carBuilder);
        carBuilder.setColor("Red");
        carBuilder.setModel("Tesla Model S");
        Car car = carBuilder.getProduct();

        System.out.println("Car:");
        System.out.println(car);

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Construction d'un manuel pour la voiture de sport
        director.constructSportsCar(manualBuilder);
        manualBuilder.setColor("Red");
        manualBuilder.setModel("Tesla Model S");
        Manual manual = manualBuilder.getProduct();

        System.out.println("\nManual:");
        System.out.println(manual);
    }
}

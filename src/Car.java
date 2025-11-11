public class Car {

    String brand;
    String model;
    int year;

    Car() {
        System.out.println("Default constructor ...");
    }

    public Car(String brand, int year, String model) {
        this.brand = brand;
        this.year = year;
        this.model = model;
    }

    public void displayCar() {
        System.out.println("Car details => brand : " + brand + ",  model : " + model + ", year : " + year + ",  ");

    }
}

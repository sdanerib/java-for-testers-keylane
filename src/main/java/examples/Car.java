package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {

    private String make;
    private String model;
    private String color;

    public Car() {

        this.make = "default make";
        this.model = "default model";
        this.color = "default color";
    }

    public Car(String make, String model, String color) {

        this.make = make;
        this.model = model;
        this.color = color;
    }

    public String printInfo() {

        return String.format("I'm a %s %s %s", this.color, this.make, this.model);
    }

    public boolean isItalian() {

        List<String> italianCarsList = Arrays.asList("Fiat", "Alfa Romeo", "Lancia", "Maserati", "Ferrari");
        return italianCarsList.contains(this.make);
    }

    public void anArrayOfCars() {

        Car[] carArray = new Car[3];

        carArray[0] = new Car("Fiat","Punto","red");
        carArray[1] = new Car("Ford","Focus","blue");
        carArray[2] = new Car("Maserati","Ghibli","black");

        carArray[1].printInfo();
    }

    public void aListOfCars() {

        List<Car> carList = new ArrayList<Car>();

        carList.add(new Car("Fiat","Punto","red"));
        carList.add(new Car("Ford","Focus","blue"));
        carList.add(new Car("Maserati","Ghibli","black"));

        carList.get(1).printInfo();
    }
}

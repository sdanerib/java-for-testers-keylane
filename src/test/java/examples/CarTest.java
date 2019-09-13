package examples;

import org.junit.Test;

public class CarTest {

    @Test
    public void carArrayTest() {

        Car myCar = new Car();
        myCar.anArrayOfCars();
    }

    @Test
    public void carListTest() {

        Car myCar = new Car();
        myCar.aListOfCars();
    }
}

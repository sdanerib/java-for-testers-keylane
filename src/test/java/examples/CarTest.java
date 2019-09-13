package examples;

import org.junit.Assert;
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

    @Test
    public void isItalianPositiveTest() {

        // Arrange - Create a new instance of the Car class with prespecified property values
        Car myCar = new Car("Maserati","Ghibli","blue");

        // Act - Invoke the method to be tested
        boolean isItalian = myCar.isItalian();

        // Assert - Check that the result of the method invocation matches the expected result
        Assert.assertTrue(isItalian);
    }
}

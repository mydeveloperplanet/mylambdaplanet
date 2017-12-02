package com.mydeveloperplanet.mylambdaplanet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestLambdas {

    private List<Car> cars;

    @Before
    public void setUp() throws Exception {
        cars = new ArrayList<Car>();

        Car car1 = new Car();
        car1.setBrand("BMW");
        Car car2 = new Car();
        car2.setBrand("Renault");

        cars.add(car1);
        cars.add(car2);
    }

    /**
     * Test 'old' way of implementing method of anonymous class
     */
    @Test
    public void testImplementValidateCar() {
        CarUtilities carUtilities = new CarUtilities();
        List<Car> filteredCars = carUtilities.filterCars(cars, new ValidateCar() {
            @Override
            public boolean validate(Car car) {
                return "BMW".equals(car.getBrand());
            }
        });

        Assert.assertEquals(1, filteredCars.size());
        Assert.assertSame("BMW", filteredCars.get(0).getBrand());

    }

    /**
     * Test 'lambda' way of implementing method of anonymous class.
     * The long format.
     */
    @Test
    public void testImplementValidateCarWithLambda1() {
        CarUtilities carUtilities = new CarUtilities();
        List<Car> filteredCars = carUtilities.filterCars(cars, (Car car) -> { return "BMW".equals(car.getBrand()); });

        Assert.assertEquals(1, filteredCars.size());
        Assert.assertSame("BMW", filteredCars.get(0).getBrand());

    }

    /**
     * Test 'lambda' way of implementing method of anonymous class.
     * A shorter format.
     */
    @Test
    public void testImplementValidateCarWithLambda2() {
        CarUtilities carUtilities = new CarUtilities();
        List<Car> filteredCars = carUtilities.filterCars(cars, car -> { return "BMW".equals(car.getBrand()); });

        Assert.assertEquals(1, filteredCars.size());
        Assert.assertSame("BMW", filteredCars.get(0).getBrand());

    }

    /**
     * Test 'lambda' way of implementing method of anonymous class.
     * The shortest format.
     */
    @Test
    public void testImplementValidateCarWithLambda3() {
        CarUtilities carUtilities = new CarUtilities();
        List<Car> filteredCars = carUtilities.filterCars(cars, car -> "BMW".equals(car.getBrand()));

        Assert.assertEquals(1, filteredCars.size());
        Assert.assertSame("BMW", filteredCars.get(0).getBrand());

    }

}

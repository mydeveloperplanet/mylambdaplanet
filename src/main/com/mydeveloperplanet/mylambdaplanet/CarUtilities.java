package com.mydeveloperplanet.mylambdaplanet;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * A utility class for Car objects
 */
public class CarUtilities {

    /**
     * Filters a list of cars, based on the given condition
     * @param cars The list of cars
     * @param validateCar The condition to filter
     * @return The filtered list of cars
     */
    public List<Car> filterCars(List<Car> cars, ValidateCar validateCar) {
        List<Car> filteredCars = new ArrayList<Car>();

        for(Car car : cars) {
            if (validateCar.validate(car)) {
                filteredCars.add(car);
            }
        }

        return filteredCars;
    }

    /**
     * Filters a list of cars, based on the given condition
     * @param cars The list of cars
     * @param validateCar The condition to filter
     * @return The filtered list of cars
     */
    public List<Car> filterCarsWithPredicate(List<Car> cars, Predicate<Car> validateCar) {
        List<Car> filteredCars = new ArrayList<Car>();

        for(Car car : cars) {
            if (validateCar.test(car)) {
                filteredCars.add(car);
            }
        }

        return filteredCars;
    }

    /**
     * Performs an action on the Cars list
     * @param cars The list of cars
     * @param consumer The action to be performed on the Car objects
     */
    public void doSomethingWithCars(List<Car> cars, Consumer<Car> consumer) {

        for(Car car : cars) {
            consumer.accept(car);
        }

    }

    /**
     * Retrieves a value from a Car object and performs an action on the value
     * @param cars The list of cars
     * @param function The value to be retrieved
     * @param consumer The action to be performed on the value
     */
    public void doSomethingWithCars(List<Car> cars, Function<Car, String> function, Consumer<String> consumer) {

        for(Car car : cars) {
            String brand = function.apply(car);
            consumer.accept(brand);
        }

    }

}

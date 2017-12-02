package com.mydeveloperplanet.mylambdaplanet;

import java.util.ArrayList;
import java.util.List;

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

}
package practice.car.dao;

import practice.car.model.Car_01;

import java.util.function.Predicate;

public class GarageImpl implements Garage {
    private Car_01[] cars;
    private int size;

    public GarageImpl(int capacity) {
        cars = new Car_01[capacity];
    }

    @Override
    public boolean addCar(Car_01 car) {
        if (car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
        cars[size++] = car;
        return true;
    }

    @Override
    public Car_01 removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (regNumber.equals(cars[i].getRegNumber())) {
                Car_01 temp = cars[i];
//                cars[i] = cars[--size];
                System.arraycopy(cars, i + 1, cars, i, size - i - 1);
                cars[--size] = null;
                return temp;
            }
        }
        return null;
    }

    @Override
    public Car_01 findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)) {
                return cars[i];
            }
        }
        return null;
    }

    @Override
    public Car_01[] findCarsByModel(String model) {
        return findCarsByPredicate(c -> model.equals(c.getModel()));
    }

    @Override
    public Car_01[] findCarsByCompany(String company) {
        return findCarsByPredicate(c -> company.equals(c.getCompany()));
    }

    @Override
    public Car_01[] findCarsByEngine(double min, double max) {
        return findCarsByPredicate(c -> c.getEngine() >= min && c.getEngine() < max);
    }

    @Override
    public Car_01[] findCarsByColor(String color) {
        return findCarsByPredicate(c -> color.equals(c.getColor()));
//        return findCarsByPredicate(c -> c.getColor().equals(color));
    }

    private Car_01[] findCarsByPredicate(Predicate<Car_01> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(cars[i])) {
                count++;
            }
        }
        Car_01[] res = new Car_01[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (predicate.test(cars[i])) {
                res[j++] = cars[i];
            }
        }
        return res;
    }

}

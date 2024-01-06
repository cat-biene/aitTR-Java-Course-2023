package homework.car.dao;

import homework.car.model.Car_03;
import homework.car.dao.Garage_03;

import java.util.ArrayList;
import java.util.List;

public class GarageImpl_03 implements Garage_03{
    private List<Car_03> cars;
    private int size;

    public GarageImpl_03(int capacity) {
        cars = new ArrayList<>(capacity);
        this.size = 0;
    }


    @Override
    public boolean addCar(Car_03 car) {
        if (car == null || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
        cars.add(car);
        return true;
    }

    @Override
    public Car_03 removeCar(String regNumber) {
        Car_03 victim = findCarByRegNumber(regNumber);
        if (victim == null) {
            return null;
        }
        cars.remove(victim);
        return victim;
    }

    @Override
    public Car_03 findCarByRegNumber(String regNumber) {
        return cars.stream()
                .filter(c -> c.getRegNumber().equals(regNumber))
                .findFirst()
                .orElse(null);


    }

    @Override
    public Car_03[] findCarsByModel(String model) {
        return cars.stream()
                .filter(c -> c.getModel().equals(model))
                .toArray(Car_03[]::new);
    }

    @Override
    public Car_03[] findCarsByCompany(String company) {
        return cars.stream()
                .filter(c -> c.getCompany().equals(company))
                .toArray(Car_03[]::new);

    }

    @Override
    public Car_03[] findCarsByEngine(double min, double max) {
        return cars.stream()
                .filter(c -> c.getEngine() >= min && c.getEngine() <= max)
                .toArray(Car_03[]::new);
    }

    @Override
    public Car_03[] findCarsByColor(String color) {
        return cars.stream()
                .filter(c -> c.getColor().equals(color))
                .toArray(Car_03[]::new);
    }

    @Override
    public int size() {
        return size;
    }
}

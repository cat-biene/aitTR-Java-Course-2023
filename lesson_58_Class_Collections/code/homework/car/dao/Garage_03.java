package homework.car.dao;

import homework.car.model.Car_03;

public interface Garage_03 {
    boolean addCar(Car_03 car);

    Car_03 removeCar(String regNumber);

    Car_03 findCarByRegNumber(String regNumber);

    Car_03[] findCarsByModel(String model);

    Car_03[] findCarsByCompany(String company);

    Car_03[] findCarsByColor(String color);

    Car_03[] findCarsByEngine(double min, double max);

    int size();
}
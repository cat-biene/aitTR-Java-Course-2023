package practice.car.dao;

import practice.car.model.Car_01;

public interface Garage {

    boolean addCar(Car_01 car);

    Car_01 removeCar(String regNumber);

    Car_01 findCarByRegNumber(String regNumber);

    Car_01[] findCarsByModel(String model);

    Car_01[] findCarsByCompany(String company);

    Car_01[] findCarsByEngine(double min, double max);

    Car_01[] findCarsByColor(String color);
}

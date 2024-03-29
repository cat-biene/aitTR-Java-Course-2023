package consultation.cars.dao;

import consultation.cars.Garage;
import consultation.cars.model.Car;

import java.util.function.Predicate;

public class GarageImpl implements Garage {

    private Car[] cars;
    private int size;

    public GarageImpl(int capacity) {
        cars = new Car[capacity];
    }
    @Override
    public boolean addCar(Car car) {
        if (car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
        cars[size++] = car;
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (regNumber.equals(cars[i].getRegNumber())) {
                Car temp = cars[i];
                cars[i] = cars[--size]; // ставим на место удаляемого элемента ставим последнй из массива
                cars[size] = null; // затираем последний элемент в массиве
                return temp;
            }

        }
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        //пробигаем по массиву. ищем по условию элемент массива
        for (int i = 0; i < size; i++) {
            if(cars[i].getRegNumber().equals(regNumber)) {
                return cars[i];
            }
        }
        return null;
    }

    // Шаг 1 - подсчет количество результатов, count
    // Шаг 2 - создаем массив длиной count
    // Шаг 3 - заполняем этот массив результатами поиска/отбора по критериям
    // Для отбора элементов будем использовать интерфейс Predicat
    @Override
    public Car[] findCarsByModel(String model) {
        return findCarsByPredicate(c -> model.equals(c.getModel()));
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        return findCarsByPredicate(c -> company.equals(c.getCompany()));
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        return findCarsByPredicate(c -> c.getEngine() >= min && c.getEngine() <= max);
    }

    @Override
    public Car[] findCarsByColor(String color) {
        return findCarsByPredicate(c -> color.equals(c.getColor()));
    }

    @Override
    public int size() {
        return size;
    }

    private Car[] findCarsByPredicate(Predicate<Car> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) { // обегаем массив
            if(predicate.test(cars[i])) { // проверяем все элементы массива на тест предикате
                count++;
            }
        }
        Car[] res = new Car[count];
        // заполняем массив
        for (int i = 0, j = 0; j < res.length; i++) {
            if(predicate.test(cars[i])) {
                res[j] = cars[i];
                j++;
            }
        }
        return res;
    }

    public void printCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        }
    }
}

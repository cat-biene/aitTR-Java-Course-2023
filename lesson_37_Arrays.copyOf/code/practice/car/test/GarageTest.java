package practice.car.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.car.dao.Garage;
import practice.car.dao.GarageImpl;
import practice.car.model.Car_01;

import static org.junit.jupiter.api.Assertions.*;

public class GarageTest {
    Garage garage;
    Car_01[] cars;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
        cars = new Car_01[4];
        cars[0] = new Car_01("Number1", "Model1", "Company1", 1.5, "Red");
        cars[1] = new Car_01("Number2", "Model2", "Company1", 2.5, "Green");
        cars[2] = new Car_01("Number3", "Model3", "Company2", 1.5, "Red");
        cars[3] = new Car_01("Number4", "Model4", "Company2", 2.0, "Green");
        for (int i = 0; i < cars.length; i++) {
            garage.addCar(cars[i]);
        }
    }

    @Test
    void addCar() {
        assertFalse(garage.addCar(cars[0]));
        Car_01 car = new Car_01("Number5", "Model4", "Company2", 2.0, "Green");
        assertTrue(garage.addCar(car));
        car = new Car_01("Number6", "Model4", "Company2", 2.0, "Green");
        assertFalse(garage.addCar(car));
    }

    @Test
    void removeCar() {
        assertEquals(cars[0], garage.removeCar("Number1"));
        assertNull(garage.removeCar("Number1"));
    }

    @Test
    void findCarByRegNumber() {
        Car_01 car = garage.findCarByRegNumber("Number4");
        assertEquals(cars[3], car);
        assertEquals(cars[3].getColor(), car.getColor());
        assertEquals(cars[3].getEngine(), car.getEngine());
        assertEquals(cars[3], garage.findCarByRegNumber(new String("Number4")));
    }

    @Test
    void findCarsByModel() {
        Car_01[] expected = { cars[2] };
        Car_01[] actual = garage.findCarsByModel(new String("Model3"));
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByCompany() {
        Car_01[] expected = { cars[2], cars[3] };
        Car_01[] actual = garage.findCarsByCompany("Company2");
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByEngine() {
        Car_01[] expected = { cars[1], cars[3] };
        Car_01[] actual = garage.findCarsByEngine(1.9, 2.6);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByColor() {
        Car_01[] expected = { cars[0], cars[2] };
        Car_01[] actual = garage.findCarsByColor(new String("Red"));
        assertArrayEquals(expected, actual);
        assertArrayEquals(new Car_01[0], garage.findCarsByColor("Black"));
    }
}

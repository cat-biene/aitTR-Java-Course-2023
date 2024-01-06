package consultation.cars.dao;

import consultation.cars.Garage;
import consultation.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {

    Garage garage;
    Car[] car;

    @BeforeEach
    void setUp() {

        garage = new GarageImpl(5);
        car = new Car[4];
        car[0] = new Car("N1", "M1", "C1", 1.5, "red");
        car[1] = new Car("N2", "M2", "C1", 2.5, "gray");
        car[2] = new Car("N3", "M3", "C2", 1.5, "red");
        car[3] = new Car("N4", "M3", "C2", 2.0, "gray");

        for (int i = 0; i < car.length; i++) {
            garage.addCar(car[i]);
        }
    }

    @Test
    void addCarTest() {
        // не добавлять null
        assertFalse(garage.addCar(null));
        // не добавлять уже имеющийся объект
        assertFalse(garage.addCar(car[2]));
        // успешно добавить новый объект
        Car car1 = new Car("N5", "M1", "C1", 3.0, "white");
        assertTrue(garage.addCar(car1));
        // не добавить, когда достигнута capacity
        Car car2 = new Car("N6", "M1", "C1", 3.0, "white");
        assertFalse(garage.addCar(car2));
    }

    @Test
    void removeCarTest() {
        // успешное удаление
        assertEquals(4, garage.size());
        assertEquals(car[3], garage.removeCar("N4"));
        assertEquals(3, garage.size());
        assertNull(garage.findCarByRegNumber("N4"));
        // не найдем удаленный объект
    }

    @Test
    void findCarByRegNumberTest() {
        // поиск успешный по regNumber
        assertEquals(car[0], garage.findCarByRegNumber("N1"));
        //  поиск не существуещего
        assertNull(garage.findCarByRegNumber("N6"));
    }

    @Test
    void findCarsByModelTest() {
        // поиск по модели
        Car[] expected = {car[2], car[3]};
        Car[] actual = garage.findCarsByModel("M3");
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByCompanyTest() {
        // поиск по компании
        Car[] expected = {car[2], car[3]};
        Car[] actual = garage.findCarsByCompany("C2");
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByEngineTest() {
        Car[] expected = {car[0], car[2], car[3]};
        Car[] actual = garage.findCarsByEngine(1.0, 2.1);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByColorTest() {
        Car[] expected = {car[0], car[2]};
        Car[] actual = garage.findCarsByColor("red");
        assertArrayEquals(expected, actual);
    }
}
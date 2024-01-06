package homework.container;

import java.util.Iterator;
import java.util.List;

public class Box implements Iterable<Parcel>{

    // Создайте класс Container с полями:
    // String label (маркировка) и List - список коробок с посылками.
    // Создайте класс Box с полем: List - список посылок.
    // Классы Container и Box являются итерируемыми.
    // Создайте класс Parcel (посылка) с полем double weight - вес посылки.
    // Создайте класс ShipmentAppl с методом main.
    // Задумайте случайное количество контейнеров (от 10 до 20).
    // В каждом контейнере задумайте случайное количество коробок (от 10 до 20).
    // В каждой коробке задумайте случайное количество посылок (от 5 до 10).
    // Предположим, что каждая посылка в среднем имеет вес = 2 кг.
    //
    //Задание 2. Подсчитайте общее количество посылок во всех ящиках и их общий вес.
    //
    //Задание 3. Найдите label того из контейнеров,
    // в котором оказалось максимальное количество посылок.
    //
    //Задание 4. Найдите все контейнеры с максимальным количеством посылок.

    // fields
    // private
    List<Parcel> parcels;

    // constructor
    public Box(List<Parcel> parcels) {
        this.parcels = parcels;
    }

    // getter
    public List<Parcel> getParcels() {
        return parcels;
    }

    @Override
    public Iterator<Parcel> iterator() {
        return parcels.iterator();
    }

    // method toString
    @Override
    public String toString() {
        return "Box{" +
                "parcels=" + parcels +
                '}';
    }
}

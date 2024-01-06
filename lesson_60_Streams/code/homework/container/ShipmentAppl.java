package homework.container;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShipmentAppl {

    public static void main(String[] args) {

        // Создайте класс ShipmentAppl с методом main.
        // Задумайте случайное количество контейнеров (от 10 до 20).
        // В каждом контейнере задумайте случайное количество коробок (от 10 до 20).
        // В каждой коробке задумайте случайное количество посылок (от 5 до 10).
        // Предположим, что каждая посылка в среднем имеет вес = 2 кг.
        //Задание 2. Подсчитайте общее количество посылок во всех ящиках и их общий вес.
        //Задание 3. Найдите label того из контейнеров,
        // в котором оказалось максимальное количество посылок.
        //Задание 4. Найдите все контейнеры с максимальным количеством посылок.

        // случайное количество контейнеров (от 10 до 20)
        List<Container> containerList = new ArrayList<>();
        int containerAll = new Random().nextInt((20 + 1 -10) + 10);
        for (int i = 0; i < containerAll; i++) {

            // случайное количество коробок (от 10 до 20)
            List<Box> boxList = new ArrayList<>();
            int boxAll = new Random().nextInt((20 + 1 - 10) + 10);
            for (int j = 0; j < boxAll; j++) {

                // случайное количество посылок (от 5 до 10)
                List<Parcel> parcelList = new ArrayList<>();
                int parcelAll = new Random().nextInt((10 + 1 - 5) + 5);
                for (int k = 0; k < parcelAll; k++) {
                    parcelList.add(new Parcel(2)); // каждая посылка весит 2 кг
                }
                boxList.add(new Box(parcelList));
            }
            containerList.add(new Container("Container" + i, boxList ));
        }
        // подсчитайте общее количество посылок во всех ящиках и их общий вес.
        int totalParcel = 0;
        int totalWeightByParcel = 0;
        for (Container container : containerList) {
            for (Box box : container) {
                for (Parcel parcel : box) {
                    totalParcel++;
                    totalWeightByParcel += parcel.getWeight();
                }
            }
        }
        System.out.println("Total parcels in boxes: " + totalParcel);
        System.out.println("Total weight of parcels: " + totalWeightByParcel);

        // Найдите label того из контейнеров, в котором оказалось максимальное количество посылок.
        int maxParcelCount = 0;
        String containerWithMaxParcelsLabel = "";

        for (Container container : containerList) {
            int currentParcelCount = 0;
            for (Box box : container) {
                currentParcelCount += box.parcels.size();
            }
            if (currentParcelCount > maxParcelCount) {
                maxParcelCount = currentParcelCount;
                containerWithMaxParcelsLabel = container.getLabel();
            }
        }

        System.out.println("Label of the container with the maximum number of parcels: " + containerWithMaxParcelsLabel);

        // Найдите все контейнеры с максимальным количеством посылок.
        List<Container> containersWithMaxParcels = new ArrayList<>();

        for (Container container : containerList) {
            int currentParcelCount = 0;
            for (Box box : container) {
                currentParcelCount += box.parcels.size();
            }
            if (currentParcelCount == maxParcelCount) {
                containersWithMaxParcels.add(container);
            }
        }

        System.out.println("Containers with the maximum number of parcels:");
        for (Container container : containersWithMaxParcels) {
            System.out.println(container.getLabel());
        }
    }
}


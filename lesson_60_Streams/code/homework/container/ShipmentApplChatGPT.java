package homework.container;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ShipmentApplChatGPT {

    public static void main(String[] args) {

        // Задание 1: Задумайте случайное количество контейнеров (от 10 до 20).
        List<Container> containerList = new Random().ints(
                        new Random().nextInt((20 - 10) + 1) + 10, 0, Integer.MAX_VALUE)
                .mapToObj(i -> {
                    // Задание 1: В каждом контейнере задумайте случайное количество коробок (от 10 до 20).
                    List<Box> boxList = new Random().ints(
                                    new Random().nextInt((20 - 10) + 1) + 10, 0, Integer.MAX_VALUE)
                            .mapToObj(j -> {
                                // Задание 1: В каждой коробке задумайте случайное количество посылок (от 5 до 10).
                                List<Parcel> parcelList = new Random().ints(
                                                new Random().nextInt((10 - 5) + 1) + 5, 0, Integer.MAX_VALUE)
                                        .mapToObj(k -> new Parcel(2.0))
                                        .collect(Collectors.toList());
                                return new Box(parcelList);
                            })
                            .collect(Collectors.toList());

                    // Задание 1: Создайте контейнер с маркировкой и списком коробок
                    return new Container("Container" + i, boxList);
                })
                .collect(Collectors.toList());

        // Задание 2: Подсчитайте общее количество посылок во всех ящиках и их общий вес.
        int totalParcels = containerList.stream()
                .flatMap(container -> container.boxes.stream())
                .flatMap(box -> box.parcels.stream())
                .mapToInt(parcel -> 1)
                .sum();
        double totalWeight = containerList.stream()
                .flatMap(container -> container.boxes.stream())
                .flatMap(box -> box.parcels.stream())
                .mapToDouble(Parcel::getWeight)
                .sum();

        System.out.println("Total number of parcels: " + totalParcels);
        System.out.println("Total weight of parcels: " + totalWeight);

        // Задание 3: Найдите label того из контейнеров, в котором оказалось максимальное количество посылок.
        String containerWithMaxParcelsLabel = containerList.stream()
                .max((c1, c2) ->
                        Integer.compare(
                                c1.boxes.stream().flatMap(box -> box.parcels.stream()).mapToInt(p -> 1).sum(),
                                c2.boxes.stream().flatMap(box -> box.parcels.stream()).mapToInt(p -> 1).sum()
                        ))
                .map(Container::getLabel)
                .orElse("");

        System.out.println("Label of the container with the maximum number of parcels: " + containerWithMaxParcelsLabel);

        // Задание 4: Найдите все контейнеры с максимальным количеством посылок.
        List<Container> containersWithMaxParcels = containerList.stream()
                .filter(container ->
                        container.boxes.stream().flatMap(box -> box.parcels.stream()).mapToInt(p -> 1).sum() ==
                                containerList.stream()
                                        .mapToInt(c ->
                                                c.boxes.stream().flatMap(box -> box.parcels.stream()).mapToInt(p -> 1).sum())
                                        .max()
                                        .orElse(0))
                .collect(Collectors.toList());

        System.out.println("Containers with the maximum number of parcels:");
        containersWithMaxParcels.forEach(container -> System.out.println(container.getLabel()));
    }
}

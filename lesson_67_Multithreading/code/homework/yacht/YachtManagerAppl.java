package homework.yacht;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class YachtManagerAppl {

    public static void main(String[] args) {

        // Создаем экземпляр YachtManager
        YachtManager yachtManager = new YachtManager();

        // Получаем список яхт из YachtManager
        List<Yacht> yachtList = yachtManager.getYachts();

        // display all yachts
        System.out.println("---------------List Yachts---------------");
        displayYacht(yachtList);

        // display yachts made from the specified hull material
        System.out.println("---------------List Yachts By Material---------------");
        displayYachtsByMaterial(yachtList, "wood");

        // display yachts more expensive than the specified price
        System.out.println("---------------List Yachts Expensive Than---------------");
        displayYachtsExpensiveThan(yachtList, 150000);

        // display yachts whose year of manufacture is in a given range
        System.out.println("---------------List Yachts By Year Range---------------");
        displayYachtsByYearRange(yachtList, 2020, 2023);

        // sort yachts in descending order of cost
        System.out.println("---------------List Yachts By Descending Order---------------");
        sortYachtsByDescendingOrder(yachtList);

        // get the average cost of a yacht from the created set
        System.out.println("---------------List Yachts Average Yacht Price---------------");
        calculateAverageYachtPrice(yachtList);
    }

    private static void calculateAverageYachtPrice(List<Yacht> yachtList) {

        double averageYachtPrice = yachtList.stream()
                .mapToDouble(Yacht::getPrice)
                .average()
                .orElse(0.0);

        System.out.println("Average Yacht Price: " + averageYachtPrice);
    }

    private static void sortYachtsByDescendingOrder(List<Yacht> yachtList) {
        List<Yacht> yachtsSortByDescendingOrder = new ArrayList<>();

        yachtList.stream()
                .sorted(Comparator.comparing(Yacht::getPrice).reversed())
                .forEach(yachtsSortByDescendingOrder::add);

        // список яхт отсортированный по убыванию цены
        for (Yacht yacht : yachtsSortByDescendingOrder) {
            System.out.println(yacht);
        }
        System.out.println();
    }

    private static void displayYachtsByYearRange(List<Yacht> yachtList, int startYear, int endYear) {
        List<Yacht> yachtsByYearRange = new ArrayList<>();

        yachtList.stream()
                .filter(yacht -> yacht.getDate().getYear() >= startYear && yacht.getDate().getYear() <= endYear)
                .forEach(yachtsByYearRange::add);

        // список яхт выше указанной ценны
        for (Yacht yacht : yachtsByYearRange) {
            System.out.println(yacht);
        }
        System.out.println();

    }

    private static void displayYachtsExpensiveThan(List<Yacht> yachtList, double price) {
        List<Yacht> yachtsExpensiveThan = new ArrayList<>();

        yachtList.stream()
                .filter(yacht -> yacht.getPrice() > price)
                .forEach(yachtsExpensiveThan::add);

        // список яхт выше указанной ценны
        for (Yacht yacht : yachtsExpensiveThan) {
            System.out.println(yacht);
        }
        System.out.println();
    }

    private static void displayYachtsByMaterial(List<Yacht> yachtList, String material) {
        List<Yacht> yachtsByMaterial = new ArrayList<>();

        yachtList.stream()
                .filter(yacht -> yacht.getBodyMaterial().equalsIgnoreCase(material))
                .forEach(yachtsByMaterial::add);

        // список яхт с указанным материалом
        for (Yacht yacht : yachtsByMaterial) {
            System.out.println(yacht);
        }
        System.out.println();
    }

    private static void displayYacht(List<Yacht> yachtList) {

        for (Yacht yacht : yachtList) {
            System.out.println(yacht);
        }
        System.out.println();
    }



}

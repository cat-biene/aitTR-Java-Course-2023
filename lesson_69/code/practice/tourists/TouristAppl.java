package practice.tourists;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class  TouristAppl {

    public static void main(String[] args) {

        // Who visited more country
        List<Tourist> tourists = getTourists();
        for (Tourist tourist : tourists) {
            System.out.println(tourist);
        }

        System.out.println("======================Most skilled tourists======================");
        printMostSkilledTourists(tourists);


        System.out.println("======================Most popular countries======================");
        printMostPopularCountries(tourists);
    } // end of main

    private static void printMostPopularCountries(List<Tourist> tourists) {

        // Creating a list of Mediterranean countries
        List<String> mediterraneanCountries = Arrays.asList("Spain", "France", "Italy", "Greece", "Turkey", "Tunisia"); // создаем список стран Средиземноморья

        // Counting the popularity of countries
        Map<String, Long> skilledCountries = tourists.stream() // преобразуем список туристов в поток. В Java поток — это последовательность элементов, которые можно обрабатывать в функциональном стиле.
                .flatMap(tourist -> Arrays.stream(tourist.getCountries())) // преобразование потока туристов в поток отдельных стран, посещаемых этими туристами
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // подсчет вхождений элементов в потоке

        // Finding the most popular country
        Map.Entry<String, Long> mostPopularCountry = skilledCountries.entrySet().stream() //  получаем заданное представление записей, содержащихся в карте 'skilledCountries'. Каждая запись представляет страну (ключ) и количество ее популярности (значение)
                .max(Map.Entry.comparingByValue())// это статический метод в интерфейсе 'Map.Entry', который возвращает компаратор, сравнивающий записи на основе их значений
                .orElse(null); // используется для обработки случая, когда поток записей пуст

        // Printing the results
        System.out.println("Most popular country: " + mostPopularCountry);

    }

    private static void printMostSkilledTourists(List<Tourist> tourists) {

        // Group tourists by the number of countries they visited
        Map<Integer, List<Tourist>> skilledTourists = tourists.stream()
                .collect(Collectors.groupingBy(p -> p.getCountries().length));

        // Find the maximum number of countries visited
        Integer max = skilledTourists.keySet().stream()
                .max(Integer::compareTo)
                .orElse(0);

        // Print the maximum number of countries
        System.out.println("Max = " + max);

    }

    private static List<Tourist> getTourists() {
        return List.of(
                new Tourist("Sophie", "France", "Italy", "Greece", "Spain"),
                new Tourist("Liam", "Spain"),
                new Tourist("Emma", "Greece", "Turkey"),
                new Tourist("Mia", "Italy", "Spain", "Turkey"),
                new Tourist("Noah", "Turkey", "Greece", "Italy"),
                new Tourist("Olivia", "Greece"),
                new Tourist("Lucas", "Spain", "France", "Italy"),
                new Tourist("Amelia", "Greece", "Spain", "Italy"),
                new Tourist("Oliver", "Spain", "Italy", "Turkey", "Greece"),
                new Tourist("Isabella", "France", "Spain", "Italy", "Greece"),
                new Tourist("Ethan", "Italy", "Greece", "Spain"),
                new Tourist("Ava", "Greece", "Turkey", "Spain", "Italy"),
                new Tourist("Liam", "Spain", "Italy", "Greece"),
                new Tourist("Sophia", "Italy", "Spain", "Turkey", "Greece"),
                new Tourist("Jackson", "Greece", "Spain", "Italy"),
                new Tourist("Olivia", "Greece", "Italy"),
                new Tourist("Logan", "Spain", "Greece", "Italy", "Turkey",  "Greece"),
                new Tourist("Emma", "Greece", "Italy", "Spain"),
                new Tourist("Aiden", "Italy", "Greece", "Spain", "Turkey")
        );


    }

} // end of class

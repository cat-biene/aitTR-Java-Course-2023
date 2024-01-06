package homework.country;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class CountryAppl {

    // Создайте класс Country со следующими полями:
    //
    // название;
    // население(в млн.);
    // континент. Создайте связный список, содержащий 11 стран из разных континентов.
    // Получите списки этих стран, отсортированные по:
    // алфавиту;
    // по размеру населения в стандартном и обратном порядках;
    // принадлежности континенту и размеру населения в порядке от большего к меньшему.

    public static void main(String[] args) {

        LinkedList<Country> country = new LinkedList<>();
        country.add(new Country("China", 1_407_839_000, "Asia"));
        country.add(new Country("Mexico", 127_792_286, "North America"));
        country.add(new Country("Egypt", 101_502_040, "Africa"));
        country.add(new Country("India", 1_383_385_000, "Asia"));
        country.add(new Country("Indonesia", 266_911_900, "Asia"));
        country.add(new Country("USA", 329_957_441, "North America"));
        country.add(new Country("Japan", 125_950_000, "Asia"));
        country.add(new Country("Pakistan", 220_065_996, "Asia"));
        country.add(new Country("Brazil", 212_572_768, "South America"));
        country.add(new Country("Nigeria", 210_615_916, "Africa"));
        country.add(new Country("Bangladesh", 171_987_524, "Asia"));

       /* for (Country c : country) {
            country.add(c);
        }*/

        System.out.println("----------Sort By Name----------");
        Collections.sort(country);
        for (Country c : country) {
            System.out.println(c);
        }


        Comparator<Country> comparatorPopulation = new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return Long.compare(o1.getPopulationCountry(), o2.getPopulationCountry());
            }
        };

        System.out.println("----------Sort By Population standard----------");
        country.sort(comparatorPopulation);
        for (Country c : country) {
            System.out.println(c);
        }

        Comparator<Country> comparatorPopulation1 = new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return Long.compare(o2.getPopulationCountry(), o1.getPopulationCountry());
            }
        };

        System.out.println("----------Sort By Population-----------");
        country.sort(comparatorPopulation1);
        for (Country c : country) {
            System.out.println(c);
        }

        Comparator<Country> comparatorContinent = new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o1.getContinent().compareTo(o2.getContinent());
            }
        };

        System.out.println("----------Sort By Continent standard----------");
        country.sort(comparatorContinent);
        for (Country c : country) {
            System.out.println(c);
        }

        Comparator<Country> comparatorContinent1 = new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o2.getContinent().compareTo(o1.getContinent());
            }
        };

        System.out.println("----------Sort By Continent-----------");
        country.sort(comparatorContinent1);
        for (Country c : country) {
            System.out.println(c);
        }


    }

}

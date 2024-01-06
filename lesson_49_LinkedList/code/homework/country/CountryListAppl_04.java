package homework.country;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CountryListAppl_04 {
    public static void main(String[] args) {

        List<Country_04> countries = new LinkedList<Country_04>();

        Country_04[] country = new Country_04[11];

        country[0] = new Country_04("United Kindom", 50, "Europe");
        country[1] = new Country_04("Germany", 80, "Europe");
        country[2] = new Country_04("Spain", 40, "Europe");
        country[3] = new Country_04("France", 45, "Europe");
        country[4] = new Country_04("China", 1600, "Asia");
        country[5] = new Country_04("Japan", 150, "Asia");
        country[6] = new Country_04("India", 1200, "Asia");
        country[7] = new Country_04("USA", 250, "North America");
        country[8] = new Country_04("Canada", 120, "North America");
        country[9] = new Country_04("Brasilia", 100, "South America");
        country[10] = new Country_04("Argentina", 80, "South America");

        for (int i = 0; i < country.length; i++) {
            countries.add(country[i]);
        }

        System.out.println("----------- Unsorted ---------");
        for (Country_04 c : countries) {
            System.out.println(c);
        }

        Comparator<Country_04> comparatorByPopulation = new Comparator<Country_04>() {
            @Override
            public int compare(Country_04 o1, Country_04 o2) {
                return o1.getPopulation() - o2.getPopulation();
            }
        };

        System.out.println("----------- Sorted by Population ---------");
        countries.sort(comparatorByPopulation);
        for (Country_04 c : countries) {
            System.out.println(c);
        }
        Comparator<Country_04> comparatorByContinentAndPopulation = new Comparator<Country_04>() {
            @Override
            public int compare(Country_04 o1, Country_04 o2) {
                int res = o1.getContinent().compareTo(o2.getContinent());
                return res !=0 ? res : -(o1.getPopulation() - o2.getPopulation());
            }
        };
        System.out.println("----------- Sorted by Contintnt and Population ---------");
        countries.sort(comparatorByContinentAndPopulation);
        for (Country_04 c : countries) {
            System.out.println(c);
        }

    }
}

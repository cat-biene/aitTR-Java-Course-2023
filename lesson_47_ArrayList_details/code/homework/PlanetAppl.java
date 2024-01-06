package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Вывести список планет отсортированный по:
//
//порядку расположения в солнечной системе;
//алфавиту;
//массе;
//количеству спутников.
public class PlanetAppl {

    public static void main(String[] args) {

        List<Planet> planet= new ArrayList<>();
        planet.add(new Planet("Mercury",0.39, 0.055, 0));
        planet.add(new Planet("Venus",0.72, 0.815, 0));
        planet.add(new Planet("Earth",1.00, 1.000, 1));
        planet.add(new Planet("Mars",1.52, 1.107, 2));
        planet.add(new Planet("Jupiter",5.20, 318.000, 79));
        planet.add(new Planet("Saturn",9.58, 95.000, 83));
        planet.add(new Planet("Uranium",19.22, 14.500, 27));
        planet.add(new Planet("Neptune",30.05, 17.000, 14));

        Comparator<Planet> comparatorByName = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        System.out.println("----------By name----------");
        planet.sort(comparatorByName);
        for (Planet pl : planet) {
            System.out.println(pl);
        }

        Comparator<Planet> comparatorDistanceToTheSun = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return Double.compare(o1.getDistanceToTheSun(), o2.getDistanceToTheSun());
            }
        };

        System.out.println("----------Distance To The Sun----------");
        planet.sort(comparatorDistanceToTheSun);
        for (Planet pl : planet) {
            System.out.println(pl);
        }

        Comparator<Planet> comparatorByMass = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return Double.compare(o1.getMass(), o2.getMass());
            }
        };

        System.out.println("----------By Mass----------");
        planet.sort(comparatorByMass);
        for (Planet pl : planet) {
            System.out.println(pl);
        }

        Comparator<Planet> comparatorNumberOfSatellites = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return Integer.compare(o1.getNumberOfSatellites(), o2.getNumberOfSatellites());
            }
        };

        System.out.println("----------Number Of Satellites----------");
        planet.sort(comparatorNumberOfSatellites);
        for (Planet pl : planet) {
            System.out.println(pl);
        }
    }
}

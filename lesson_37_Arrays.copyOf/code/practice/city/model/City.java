package practice.city.model;

import java.util.Objects;

public class City implements Comparable<City>{

    //fields
    private String name;
    private int population;


    // construtor
    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }


    // getter
    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    // method toString
    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (population != city.population) return false;
        return Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + population;
        return result;
    }

    @Override
    public int compareTo(City o) {
        return Integer.compare(population, o.population);
    }
}

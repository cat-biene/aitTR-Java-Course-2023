package practice;

import java.util.Objects;

public class River implements Comparable<River>{

    // fields
    private String name;
    private int length;
    private String continent;

    // constructor
    public River(String name, int length, String continent) {
        this.name = name;
        this.length = length;
        this.continent = continent;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public String getContinent() {
        return continent;
    }

    // methods equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        River river = (River) o;
        return Objects.equals(name, river.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // method toString
    @Override
    public String toString() {
        return "River{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", continent='" + continent + '\'' +
                '}';
    }

    // sorted by alphabet
    @Override
    public int compareTo(River o) {
        return this.name.compareTo(o.getName());
    }
}

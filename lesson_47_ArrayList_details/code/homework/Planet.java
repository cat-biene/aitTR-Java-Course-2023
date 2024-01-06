package homework;

import java.util.Objects;

// Занести планеты солнечной системы в список, содержащий:
//
//наименование;
//расстояние до Солнца;
//массу;
//количество спутников.
public class Planet {

     // fields of class
    private String name;
    private double distanceToTheSun;
    private double mass;
    private int numberOfSatellites;

    // constructor
    public Planet(String name, double distanceToTheSun, double mass, int numberOfSatellites) {
        this.name = name;
        this.distanceToTheSun = distanceToTheSun;
        this.mass = mass;
        this.numberOfSatellites = numberOfSatellites;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistanceToTheSun() {
        return distanceToTheSun;
    }

    public void setDistanceToTheSun(double distanceToTheSun) {
        this.distanceToTheSun = distanceToTheSun;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }

    public void setNumberOfSatellites(int numberOfSatellites) {
        this.numberOfSatellites = numberOfSatellites;
    }

    // method toString
    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", distanceToTheSun=" + distanceToTheSun +
                ", mass=" + mass +
                ", numberOfSatellites=" + numberOfSatellites +
                '}';
    }

    // methods equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return Double.compare(distanceToTheSun, planet.distanceToTheSun) == 0 && Double.compare(mass, planet.mass) == 0 && numberOfSatellites == planet.numberOfSatellites && Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distanceToTheSun, mass, numberOfSatellites);
    }
}

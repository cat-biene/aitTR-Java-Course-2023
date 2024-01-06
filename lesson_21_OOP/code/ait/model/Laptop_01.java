package ait.model;

public class Laptop_01 extends Computer_01{

    // fields
    private double hours;
    private double weight;

    // constructor
    public Laptop_01(String cpu, int ram, int ssd, String brand, double hours, double weight) {
        super(cpu, ram, ssd, brand);
        this.hours = hours;
        this.weight = weight;
    }

    // getter and setter
    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return super.toString() + ", Hours: " + hours + ", Weight: " + weight;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Laptop_01)){
            return false;
        }
        Laptop_01 other = (Laptop_01) object;
        return super.equals(other) && hours == other.hours && weight == other.weight;
    }
}

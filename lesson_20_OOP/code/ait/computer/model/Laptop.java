package ait.computer.model;

public class Laptop extends Computer {

    // fields
    private double hours;
    private double weight;

    // constructor
    public Laptop(String cpu, int ram, int ssd, String brand, double hours, double weight) {
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

    // method display
    @Override
    /* public void display(){
        System.out.printf(" Brand: " + getBrand() + " CPU: " + getCpu() + " RAM: "
                + getRam() + " SSD: " + getSsd() + " Battery: " + hours + " Weight: " + weight);
    }*/

    public void display() {
        super.display();
        System.out.print(" Battery: " + hours + " Weight: " + weight);
    }

}

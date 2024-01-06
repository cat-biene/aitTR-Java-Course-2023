package practice.computer.model;

public class Laptop extends Computer {

    // fields
    private String display;
    private int batteryCapacity;
    private double weight;

    // constructor
    public Laptop(String cpu, int ram, int hdd, String brand, String display, int batteryCapacity, double weight) {
        super(cpu, ram, hdd, brand);
        this.display = display;
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
    }

    /*// getter and setter
    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    } */

    // method to String

    @Override
    public String toString() {
        return super.toString() + "Laptop{" +
                "display='" + display + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", weight=" + weight +
                '}';
    }
}

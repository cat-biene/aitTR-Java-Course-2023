package practice.computer.model;

public class Laptop_02 extends Computer_02{

    private double hours;
    private double weight;

    public Laptop_02(String cpu, int ram, int ssd, String brand, double hours, double weight) {
        super(cpu, ram, ssd, brand);
        this.hours = hours;
        this.weight = weight;
    }

    public double getHours() {
        return hours;
    }


    public double getWeight() {
        return weight;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return super.toString() + ", Hours: " + hours + ", Weight: " + weight;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Laptop_02)){
            return false;
        }
        Laptop_02 other = (Laptop_02) object;
        return super.equals(other) && hours == other.hours && weight == other.weight;
    }
}


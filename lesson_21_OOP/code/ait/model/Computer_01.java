package ait.model;

public class Computer_01 {
    // fields
    private String cpu;
    private int ram;
    private int ssd;
    private String brand;

    // constructor
    public Computer_01(String cpu, int ram, int ssd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }

    public Computer_01() {

    }

    // getter and setter
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", CPU: " + cpu + ", RAM: " + ram + ", SSD: " + ssd;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Computer_01)) {
            return false;
        }
        Computer_01 other = (Computer_01) object;
        return cpu == other.cpu && ram == other.ram && ssd == other.ssd && brand == other.brand;
    }
}

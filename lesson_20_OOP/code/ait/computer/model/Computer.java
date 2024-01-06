package ait.computer.model;

public class Computer {

    // fields
    private String cpu;
    private int ram;
    private int ssd;
    private String brand;

    // constructor
    public Computer(String cpu, int ram, int ssd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }

    public Computer() {

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

    // method display
    public void display() {
        System.out.print(" Brand: " + brand + " CPU: " + cpu + " RAM: " + ram + " SSD: " + ssd);
    }
}

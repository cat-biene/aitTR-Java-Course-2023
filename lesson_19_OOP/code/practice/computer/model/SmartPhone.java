package practice.computer.model;
// Добавить класс SpartPhone, расширяющий класс Laptop в классной работе.
// В классе ComputerAppl добавить объекты типа SmartPhone.
// Вывести список всех устройства на печать.
// Посчитать общий объем памяти HDD на всех устройствах.

public class SmartPhone extends Laptop{

    //fields

    private double diagonal;
    private int camera;

    // constructor
    public SmartPhone(String cpu, int ram, int hdd, String brand, String display, int batteryCapacity, double weight, double diagonal, int camera) {
        super(cpu, ram, hdd, brand, display, batteryCapacity, weight);
        this.diagonal = diagonal;
        this.camera = camera;
    }

    // getter and setter

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    // method toString

    @Override
    public String toString() {
        return "SmartPhone{" +
                "diagonal=" + diagonal +
                ", camera=" + camera +
                '}';
    }
}

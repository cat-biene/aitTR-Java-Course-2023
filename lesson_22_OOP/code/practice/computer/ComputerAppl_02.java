package practice.computer;

import practice.computer.model.Computer_02;
import practice.computer.model.Laptop_02;
import practice.computer.model.Smartphone_02;

public class ComputerAppl_02 {

    public static void main(String[] args) {
    Computer_02[] shop = new Computer_02[5];
    shop[0] = new Computer_02("i5", 12, 512, "HP");
    shop[1] = new Laptop_02("i7", 24, 1024, "Asus", 3, 2.1);//upper casting from Laptop to Computer
    shop[2] = new Laptop_02("i7", 24, 1024, "Asus", 4.5, 2.2);
    shop[3] = new Smartphone_02("Snapdragon", 8, 128, "Samsung", 24, 0.15, 123456789098l);
    printArray(shop);
    System.out.println("========================");
    Computer_02 computer = new Computer_02("i5", 12, 512, "HP");
    boolean checker = shop[0].equals(computer);
    System.out.println(checker);
    checker = shop[3].equals(computer);
    System.out.println(checker);
    checker = shop[1].equals(shop[2]);
    System.out.println(checker);
    Smartphone_02 smartphone = new Smartphone_02("Snapdragon", 8, 128, "Samsung", 24, 0.15, 123456789097l);
    checker = smartphone.equals(shop[3]);
    System.out.println(checker);
}

    public static void printArray(Computer_02[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].toString());
            }
        }
    }
}

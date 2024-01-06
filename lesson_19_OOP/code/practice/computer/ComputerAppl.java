package practice.computer;

import practice.computer.model.Computer;
import practice.computer.model.Laptop;
import practice.computer.model.SmartPhone;

public class ComputerAppl {

    public static void main(String[] args) {

        Computer[] computer = new Computer[4];


        computer[0] = new Computer("j9", 16, 512, "Asus");
        // System.out.println(computer[0]);
        computer[1] = new Laptop("i5", 8, 256, "Acer", "14", 4000, 5);
        // System.out.println(computer[1]);
        computer[2] = new Laptop("i5",16, 512,"MacBook", "14", 5000, 2);
        computer[3] = new SmartPhone("S695", 6, 128, "Redmi", "IPS", 5000, 1,6,108);

        for (int i = 0; i < computer.length; i++) {
            System.out.println(computer[i]);
        }

        int sumHdd = 0;
            for (int i = 0; i < computer.length; i++) {
                sumHdd = sumHdd + computer[i].getHdd();
        }
        System.out.println(" Total HDD = " + sumHdd);
    }
}

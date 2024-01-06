package ait.computer;

import ait.computer.model.Computer;
import ait.computer.model.Laptop;

public class ComputerAppl {

    public static void main(String[] args) {

        Computer computer = new Computer("i5", 12, 512, "HP");
        Laptop laptop = new Laptop("i7", 16, 512,"Asus", 3, 2.1);
        computer.display();
        System.out.println();
        laptop.display();
        System.out.println();

    }
}

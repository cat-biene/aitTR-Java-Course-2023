package ait;

import ait.model.Computer_01;
import ait.model.Laptop_01;
import ait.model.Smartphone_01;

public class CastingAppl_01 {

    public static void main(String[] args) {
        Computer_01 lap1 = new Laptop_01("i7", 16, 512, "Asus", 3, 2.1);//upper casting from Laptop to Computer
        System.out.println(lap1);
        if (lap1 instanceof Laptop_01) {
            Laptop_01 laptop1 = (Laptop_01) lap1;//down casting from Computer to Laptop
            laptop1.setHours(4.5);
            System.out.println(laptop1);
        }
        System.out.println(lap1);
        Computer_01 smart1 = new Smartphone_01("Snapdragon", 8, 128, "Samsung", 24, 0.15, 123456789098l);
        if (smart1 instanceof Smartphone_01) {
            Smartphone_01 smartphone1 = (Smartphone_01) smart1;
            System.out.println(smartphone1.getImei());
        }
        if (lap1 instanceof Smartphone_01) {
            Smartphone_01 smartphone2 = (Smartphone_01) lap1;
            System.out.println(smartphone2);
        } else {
            System.out.println("lap1 not a Smartphone");
        }

    }
}

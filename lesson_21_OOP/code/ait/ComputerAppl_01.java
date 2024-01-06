package ait;

import ait.model.Computer_01;
import ait.model.Laptop_01;
import ait.model.Smartphone_01;

public class ComputerAppl_01 {

    public static void main(String[] args) {
        double a = 10; //upper casting
        int b = (int) a; //down casting
        Computer_01[] shop = new Computer_01[5];
        shop[0] = new Computer_01("i5", 12, 512, "HP");
        shop[1] = new Laptop_01("i7", 16, 512, "Asus", 3, 2.1);//upper casting from Laptop to Computer
        shop[2] = new Laptop_01("i7", 24, 1024, "Asus", 3, 2.1);
        shop[3] = new Smartphone_01("Snapdragon", 8, 128, "Samsung", 24, 0.15, 123456789098l);
        printArray(shop);
        int total = getTotalSSDCapacity(shop);
        System.out.println("Total ssd capacity = " + total);
        Laptop_01 laptop1 = (Laptop_01) shop[1]; //down casting
        laptop1.setHours(4.5);
        System.out.println(laptop1);
        System.out.println(shop[1]);
    }

    public static void printArray(Computer_01[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].toString());
            }
        }
    }

    public static int getTotalSSDCapacity(Computer_01[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                res += arr[i].getSsd(); // res = res + arr[i].getSsd();
            }
        }
        return res;
    }

    public static int getTotalSSDLaptopCapacity(Computer_01[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Laptop_01 && ! (arr[i] instanceof Smartphone_01)) {
                res += arr[i].getSsd(); // res = res + arr[i].getSsd();
            }
        }
        return res;
    }

    public static double getTotalLaptopHours(Computer_01[] arr) {
        double res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Laptop_01) {
                Laptop_01 laptop = (Laptop_01) arr[i];
                res += laptop.getHours(); // res = res + laptop.getHours();
            }
        }
        return res;
    }
}

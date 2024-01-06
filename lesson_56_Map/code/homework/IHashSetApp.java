package homework;

import homework.car.dao.IHashSet_02;
import homework.car.dao.ISet_02;
import homework.car.model.Car_02;

public class IHashSetApp {
    public static void main(String[] args) {


        ISet_02<String> mySet = new IHashSet_02<>();
        System.out.println(mySet.size());

        mySet.add("Amsterdam");
        mySet.add("Ottawa");
        mySet.add("Berlin");
        mySet.add("Seoul");
        mySet.add("Paris");
        mySet.add("Moscow");
        mySet.add("Washington DC");
        System.out.println(mySet.size());
        mySet.add("Leipzig");
        System.out.println(mySet.size());

        System.out.println("=======Iterator=====");
        for (String s : mySet) {
            System.out.println(s);
        }

        System.out.println("======= Numbers from 1 to 100 =====");
        ISet_02<Integer> numberSet = new IHashSet_02<>();
        for (int i = 0; i < 100; i++) {
            numberSet.add(i);
        }
        printSetInteger(numberSet);

        System.out.println("======= Numbers from 100 to 1=====");
        ISet_02<Integer> numberSet1 = new IHashSet_02<>();
        for (int i = 0; i < 100; i++) {
            numberSet1.add(100 - i);
        }
        printSetInteger(numberSet1);

        System.out.println("======= Random numbers =====");
        ISet_02<Integer> numberSet2 = new IHashSet_02<>();
        for (int i = 0; i < 100; i++) {
            int random = (int)(Math.random() * (100 - 1 + 1) + 1);
            numberSet2.add(random);
        }
        printSetInteger(numberSet2);

        System.out.println("======= Objects - cars =====");
        ISet_02<Car_02> carSet = new IHashSet_02<>();
        Car_02[] car = new Car_02[4];
        car[0] = new Car_02("VW", "123", "silver");
        car[1] = new Car_02("Mercedes", "456", "black");
        car[2] = new Car_02("Volvo", "789", "brown");
        car[3] = new Car_02("Volvo", "790", "brown");
        for (int i = 0; i < car.length; i++) {
            carSet.add(car[i]);
        }
        printSetCar(carSet);
    }

    public static void printSetInteger(ISet_02<Integer> set){
        for (Integer n : set) {
            System.out.print(n + " | ");
        }
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
    }

    public static void printSetCar(ISet_02<Car_02> set){
        for (Car_02 car : set) {
            System.out.print(car + " | ");
        }
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
    }
}

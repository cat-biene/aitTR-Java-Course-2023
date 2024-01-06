package practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionMethods {

    // Создайте список известных вам фруктов.
    // Выполните поиск имеющегося и отсутствующего элемента списка.
    // Отсортируйте этот список по алфавиту в прямом и обратном порядке.
    // Проверьте работу методов
    // max(Collection<?> coll)
    // min(Collection<?> coll), что они возвращают?
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("pear");
        fruits.add("plum");
        fruits.add("strawberry");


        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("------------------------------------------------------------");

        Collections.sort(fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("------------------------------------------------------------");

        String key = "banana";
        int index = Collections.binarySearch(fruits,key);
        System.out.println("Index = " + index + " of " + key);

        key = "kiwi";
        index = Collections.binarySearch(fruits,key);
        System.out.println("Index = " + index + " of " + key);
        System.out.println("------------------------------------------------------------");

        Comparator<String> comparatorFruits = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        };
        Collections.sort(fruits, comparatorFruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("------------------------------------------------------------");

        String max = Collections.max(fruits);
        System.out.println("Max of = " + max);

        String min = Collections.min(fruits);
        System.out.println("Min of = " + min);
        System.out.println();

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("------------------------------------------------------------");

        Collections.reverse(fruits);

        max = Collections.max(fruits, comparatorFruits);
        System.out.println("Max of = " + max);

        min = Collections.min(fruits, comparatorFruits);
        System.out.println("Min of = " + min);
        System.out.println();

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("------------------------------------------------------------");
    }
}

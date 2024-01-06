package homework;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();

        // Вариант 1
        for (char c = 65; c <= 90; c++) {
            list.add(c);
        }
        System.out.println(list);
        list.clear();

        // Вариант 2
        for (char c = 'A'; c <= 'Z'; c++) {
            list.add(c);
        }
        System.out.println(list);
        list.clear();

        // Вариант 3
        for (char c = 97; c <= 122; c++) {
            list.add(c);
        }
        System.out.println(list);
        list.clear();

        // Вариант 4
        for (char c = 'a'; c <= 'z'; c++) {
            list.add(c);
        }


        System.out.println(list);

    }

}

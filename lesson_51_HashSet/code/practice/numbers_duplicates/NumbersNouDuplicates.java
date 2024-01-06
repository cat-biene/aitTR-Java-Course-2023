package practice.numbers_duplicates;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// - Имеется список из 100 случайных чисел в интервале от 1 до 10, необходимо удалить из него
//
//  все дубликаты.
public class NumbersNouDuplicates {

    public static void main(String[] args) {

        int[] numbers = new int[100];
        int a = 1;
        int b = 10;

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(b + a);
        }
        for (Integer n : numbers) {
            System.out.print(n + " | ");
        }

        Set<Integer> uniqueNumbers = new HashSet<>();
        System.out.println("-------------------------------------");
        System.out.println("Size of set: " + uniqueNumbers.size());
        System.out.println("Is empty = " + uniqueNumbers.isEmpty());

        // занесли массив в set (for i)
        for (int i = 0; i < numbers.length; i++) {
            uniqueNumbers.add(numbers[i]);
        }

        // занесли массив в set (for each)
        for (Integer n: numbers) {
            uniqueNumbers.add(n);
        }

        // аспечатали set, способ 1
        for (Integer n : uniqueNumbers) {
            System.out.print(n + " | ");
        }
        System.out.println();
        System.out.println("--------------------------------");

        System.out.println();
        // аспечатали set, способ 2
        System.out.println(uniqueNumbers);
    }
}

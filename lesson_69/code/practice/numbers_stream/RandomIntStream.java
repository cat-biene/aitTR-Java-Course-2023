package practice.numbers_stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.Stream;

public class RandomIntStream {

    private static final int N_NUMBER = 6;
    private static final int MIN = -10;
    private static final int MAX = 10;


    public static void main(String[] args) {
        // - создать с помощью stream поток случайных целых чисел;
        // - выведите на печать элементы потока;
        // - сколько в потоке получилось положительных чисел? сколько отрицательных?
        // - просуммируйте все нечетные элементы потока;
        // - найдите максимальное число, минимальное число;
        // - выведите значения метода summaryStatistic.



        // properties(options, arguments for the method), needed for the thread
        // how many such numbers do you need
        // from what min numbers and up to max numbers
        // N_NUMBER, MIN, MAX

        Stream<Integer> numbers = getRandomNumber(N_NUMBER, MIN, MAX);
        numbers.forEach(System.out::println); // the thread has completed and is closed

        // print beautiful
        Stream<Integer> numbers1 = getRandomNumber(N_NUMBER, MIN, MAX);
        numbers1.forEach(s -> System.out.print(s + " | "));
        System.out.println();

        // print with index //TODO

        //
        long positiveCount = getRandomNumber(N_NUMBER, MIN, MAX)
                .peek(n -> System.out.print(n + " | "))
                .filter(n -> n > 0)
                .count();

        System.out.println("\nPositive numbers: " + positiveCount);

        long negativeCount = getRandomNumber(N_NUMBER, MIN, MAX)
                .peek(n -> System.out.print(n + " | "))
                .filter(n -> n > 0)
                .count();

        System.out.println("\nNegative numbers: " + negativeCount);

        // sum of all odd stream elements
        int sumOddNumbers = getRandomNumber(N_NUMBER, MIN, MAX)
                .peek(n -> System.out.print(n + " | "))
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("\nSum of odd numbers from stream: " + sumOddNumbers);

        // find the max and min numbers
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - 02;
            }
        };

        int max = getRandomNumber(N_NUMBER, MIN, MAX)
                .peek(n -> System.out.print(n + " | "))
                .max(Comparator.naturalOrder())
                        .orElseThrow();

        System.out.println("Max value = " + max);

        //
        IntSummaryStatistics intStas = getRandomNumber(N_NUMBER, MIN, MAX)
                .mapToInt(Integer::intValue)
                .peek(n -> System.out.print(n + " | "))
                .summaryStatistics();

        System.out.println("\nmin = " + intStas.getMin());
        System.out.println("\nmax = " + intStas.getMax());
        System.out.println("\nsum = " + intStas.getSum());
        System.out.println("\navg = " + intStas.getAverage());
        System.out.println(intStas);
    } // end of main

    private static Stream<Integer> getRandomNumber(int nNumber, int min, int max) {
        return new Random()
                .ints(min, max)
                .limit(nNumber)
                .boxed(); // packing into numbers

    }

} // end of class
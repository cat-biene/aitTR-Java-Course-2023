package practice.stream_intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAppl {

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(List.of(1, 9, 2, 8, 3, 7, 4, 6, 5));

        number.stream() // открыл стрим
                .filter(n -> n > 3) // отбираем числа больше 3
                .peek(n -> System.out.println("peak before sort: "+ n))
                .sorted((n1, n2) -> -Integer.compare(n1, n2)) // сортирует
                .forEach(System.out::println); // print

        System.out.println("==============================");
        number.forEach(System.out::println); // еще один вариант печати
        System.out.println("==============================");

        Integer[] arr = {1, 9, 2, 8, 3, 7, 4, 6, 5};
        Stream<Integer> integerStream = Arrays.stream(arr)
                .filter(n -> n > 2)
                .filter(n -> n % 2 == 0)  // нужные четные
                .sorted((n1, n2) -> - Integer.compare(n1, n2));

        integerStream.forEach(System.out::println);

        Integer res = Arrays.stream(arr)
                .map(n -> n * 10)
                .reduce(0, (accum, n) ->  accum + n);
        System.out.println("sum = " + res);

        String str = Arrays.stream(arr)
                .sorted((n1, n2) -> - Integer.compare(n1, n2))
                .map(Object::toString)
                .reduce("Result = ", (accum, n) ->  accum + n);
        System.out.println(str);
        System.out.println("==============================");

    }
}

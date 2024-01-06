package practice.programmers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ProgrammerAppl {

    // 1. Кто из программистов знает больше всего языков(поименно)
    // Ф И -> количество языков или количество языков -> программистов
    // 2. Какие языки популярны среди наших программистов
    // языки программирования - сколько программистов его знают
    public static void main(String[] args) {

        List<Programmer> programmers = getProgrammers(); // заполняем список программистов
        
        System.out.println("===========Most skilled programmers==========");
        printMostSkilledProgrammers(programmers);

        System.out.println("===========Most popular technologies==========");
        printMostPopularTechnologies(programmers);

    } // end of main

    private static void printMostPopularTechnologies(List<Programmer> programmers) {
        System.out.println("===================Print all technologies============================");
        Iterable<String> technologies = programmers.stream()
                .map(p -> p.getTechnologies()) // преобразование объекта programmer в одно его поле с массивом технологий
                .flatMap(t -> Arrays.stream(t))// каждый из массивов преобразуем в отдельный стрим
                .collect(Collectors.toList()); // собираем результат стримов в лист

        System.out.println("=============List of Technologies==============");
        StreamSupport.stream(technologies.spliterator(), false)
                .distinct()
                .forEach(System.out::println);

        System.out.println("=================Grouper By Programmers==================");
        Map<String, Long> techFrequency = programmers.stream()
                .map(Programmer::getTechnologies)
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(t -> t, Collectors.counting()));

        System.out.println(techFrequency);

        Long max = techFrequency.values().stream()
                .max(Long::compareTo)
                .orElse(0l);

        techFrequency.entrySet().stream()
                .filter(e -> max.equals(e.getKey())) // взяли только тех которые равны max
                .forEach(e -> System.out.println(e.getKey()));
    }

    private static void printMostSkilledProgrammers(List<Programmer> programmers) {
        Map<Integer, List<Programmer>> skilledProgrammer = programmers.stream()
                .collect(Collectors.groupingBy(p -> p.getTechnologies().length));

        Integer max = skilledProgrammer.keySet().stream()
                .max(Integer::compareTo)
                .orElse(0);

        skilledProgrammer.get(max).forEach(System.out::println);

        /*Map<Integer, List<Programmers>> skilledProgrammer = new HashMap<>();
        int max = 0;

        for(Programmers programmer : programmers) {
            int key = programmer.getTechnologies().length; // ключ для map
            max = key > max ? max : max;
            skilledProgrammer.putIfAbsent(key, new ArrayList<>()); // если такой ключ встретился первый раз, то создаем пустой лист
            List<Programmers> programmersList = skilledProgrammer.get(key);
            programmersList.add(programmer);
        }
        System.out.println(skilledProgrammer);
        System.out.println();*/
    }

    private static List<Programmer> getProgrammers() {
        return List.of(
                new Programmer("Peter", "C++", "Python", "Java", "Kotlin"),
                new Programmer("John", "Python", "Java"),
                new Programmer("Helen", "Kotlin", "Scala", "Java", "JavaScript"),
                new Programmer("Jacob", "Python", "Go"),
                new Programmer("Mikhail", "Fortran", "Algol", "PL-1")
        );
    }
} // end of class

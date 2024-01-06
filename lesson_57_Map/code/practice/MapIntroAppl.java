package practice;

import java.util.*;

public class MapIntroAppl {

    // создадим Map, отражающее количество людей (население) в городах США
    public static void main(String[] args) {
        Map<String, Integer> usaCities = new TreeMap<>();
        usaCities.put("Denver", 600_000);
        usaCities.put("Boston", 670_000);
        usaCities.put("Chicago", 2_700_000);
        usaCities.put("Atlanta", 470_000);
        usaCities.put("New York", 8_500_000);
        usaCities.put("Dallas", 1_300_000);
        System.out.println("Map size: " + usaCities.size());
        System.out.println("Is empty: " + usaCities.isEmpty());

        // получение значения по ключу
        Integer num = usaCities.get("Chicago");
        System.out.println(num);
        System.out.println();
        int population = usaCities.get("Atlanta");
        System.out.println(population);

        // проверка ключа на наличие Map
        System.out.println(usaCities.containsKey("Boston"));
        System.out.println(usaCities.containsKey("Detroit"));

        // обновим значение в Map по ключу
        num = usaCities.put("Chicago", 2_700_001);
        System.out.println(num); // это старое значение переменной
        System.out.println(usaCities.get("Chicago")); // вытаскиваем старое значение
        num = usaCities.put("Chicago", 2_700_002);
        System.out.println(num); // это старое значение переменной

        Collection<Integer> popul = usaCities.values();
        int total = 0;
        for (Integer p : popul) {
            total += p;
        }

        System.out.println("Population: " + total);

        // распечатать содержимое Map
        System.out.println("========= Print map 1==========");
        Set<String> keys = usaCities.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + usaCities.get(key));
        }

        // второй способ
        System.out.println("========= Print map 2==========");
        Set<Map.Entry<String, Integer>> entries = usaCities.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("========= Print map 3==========");
        System.out.println(usaCities.entrySet());
    }
}

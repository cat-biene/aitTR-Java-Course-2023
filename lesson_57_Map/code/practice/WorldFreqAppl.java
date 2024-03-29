package practice;

import java.util.*;

public class WorldFreqAppl {

    public static void main(String[] args) {

        String[] words = {"abc", "ab", "limit", "ab", "a", "ab", "limit"};
        printWordsFrequency(words);
    }

    private static void printWordsFrequency(String[] words) {
        Map<String, Integer> resultMap = new HashMap<>();

        for (String word : words) {
            if(!resultMap.containsKey(word)) {
                resultMap.put(word, 1);
            } else {
                resultMap.put(word, resultMap.get(word) + 1);
            }
        }
        Set<Map.Entry<String, Integer>> entries = resultMap.entrySet();
        System.out.println("=======================Unsorted============================");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " =>" + entry.getValue());
        }

        System.out.println("=======================Sorted by value desc============================");
        List<Map.Entry<String, Integer>> list = new ArrayList<>(entries);
        list.sort((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()));
        list.forEach(e -> System.out.println(e));
    }
}

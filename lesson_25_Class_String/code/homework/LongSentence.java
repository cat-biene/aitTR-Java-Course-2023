package homework;
// Напишите метод, который отвечает на вопрос сколько слов в этом предложении.
// Обратите внимание, что тире не является словом.
// Подсчитайте, сколько букв (не символов!) в этом предложении.

import java.util.Arrays;
import java.util.Scanner;

public class LongSentence {
    public static void main(String[] args) {
        String sentence = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";
        String[] words = sentence.split(" ");
        System.out.println(words.length);
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals("–")) {
                count++;
            }
        }
        System.out.println(count);
        int w = words.length - count;
        System.out.println(w);
        System.out.println("----------");

        String sentence1 = sentence.replace(" – ", " ");
        String[] words1 = sentence1.split(" ");
        System.out.println(words1.length);
        System.out.println("----------");

        String sentence2 = sentence1.replace("-", "");
        String sentence3 = sentence2.replace(",", "");
        String sentence4 = sentence3.replace(".", "");
        String sentence5 = sentence4.replace(" ", "");
        String[] letters = sentence5.split("");
        System.out.println("Quantity of letters in string: " + letters.length);
        System.out.println(Arrays.toString(letters));
        System.out.println("----------");

        // Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!"
        // Выполнить практикум с этой строкой:
        // Распечатать последний символ строки.
        // Найти позицию подстроки “Java” в строке.
        // Проверить, содержит ли заданная строка подстроку “Java”.
        // Заменить все символы “o” на “a”.
        // Преобразуйте строку к верхнему регистру.
        // Преобразуйте строку к нижнему регистру.
        // Вырезать подстроку Java c помощью метода substring().
        // Проверить, заканчивается ли строка подстрокой “!!!”.
        // Проверить, начинается ли строка подстрокой “I'm proud”.

        String str = "I'm proud to learn Java! Java is the most famous programming language!!!";
        System.out.println(str);
        char a = str.charAt(str.length() - 1);
        System.out.println("Last simbol of string: "+ a);
        int index = str.indexOf("Java");
        System.out.println(index);
        System.out.println("----------");
        String str1 = "Java";
        System.out.println(str.equals(str1));
        System.out.println(str1.equalsIgnoreCase(str1));
        System.out.println("----------");
        String str2 = str.replace("o", "a");
        System.out.println(str2);
        System.out.println("----------");
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println("----------");
        System.out.println(str.substring(19, 23));
        System.out.println("----------");
        boolean str3 = str.endsWith("!!!");
        System.out.println(str3);
        boolean str4 = str.startsWith("I'm proud");
        System.out.println(str4);
        System.out.println("----------");
    }
}

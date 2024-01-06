package homework;

import java.util.Arrays;

public class Sentence {
    // Какое надо использовать регулярное выражение replace, чтобы в строке остались только буквы, и (!) пробелы.
    // Ну или по другому: удалить все символы из строки.
    // [^] - выбирает любой символ который НЕ перечислен внутри квадратных скобок
    // Соответственно далее мы перечисляем что нам нужно оставить. А именно:
    // a-zA-Z - Латинские символы
    // а-яёА-ЯЁ - Русские символы
    // пробел
    public int countWords(String str) {
        String x = str.replaceAll("[^a-zA-Za-яёА-ЯЁ ]","");
        String[] words = x.split(" ");
        System.out.println(Arrays.toString(words));

        return words.length ;
    }


    public int countWordsVersion2(String str) {
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);
        int n = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("–") || words[i].equals("-") || words[i].equals(",")) {
                n++;
            }
        }
        return words.length - n;
    }

    // Символом в строке является всё, за исключением пробелов.
    // Поэтому мы пробелы в массив символов не заносим
    // ВАРИАНТ 1. Более эффективный и менее затратный по количеству выполняемых операций
    public int countSymbols(String str) {
        String[] symbols = str.replaceAll(" ", "").split("");
        return symbols.length;
    }

    // Символом в строке является всё, за исключением пробелов.
    // Поэтому мы проверяем в массиве символов на наличие пробелов. Заносим в переменную n
    // И потом это число (n) отнимаем от длины массива.
    // ВАРИАНТ 2. Тоже эффективный, но очень затратный по количеству выполняемых операций
    public int countSymbolsVersion2(String str) {
        int n = 0;
        String[] symbols = str.split("");
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i].equals(" ")) {
                n++;
            }
        }
        return symbols.length - n;
    }
}

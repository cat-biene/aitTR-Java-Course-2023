package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringAppl {

    public static void main(String[] args) {

        System.out.println("--------------------");
        String str = "Hello";
        char[] chars = {32, 'w', 'o', 'r', 'l', 'd'}; // 32 - это код пробела
        String str1 = new String(chars);
        System.out.println(str1);
        str = str + str1;
        System.out.println(str);
        str = str.concat(str1); // аналогичная операция, добавил еще раз слово world
        System.out.println(str);
        int l = str.length(); // выясняем длину строки
        System.out.println("Length of string " + str + " : " + l);
        char c = str.charAt(str.length() - 1); // определяем последний символ в строке
        System.out.println("Last simbol of string: "+ c);
        System.out.println("--------------------");
        System.out.print("Print by letter: "); // печать по буквам
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
        System.out.println("--------------------");
        String str2 = " World"; // будем его сравнивать с str1 = " world"
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        String str3 = str1.toUpperCase(); // переводим строку в toUpperCase
        System.out.println(str3);
        System.out.println(str3.toLowerCase()); // переводим в нижний регистр
        System.out.println("--------------------");
        // index - позиция символа в строке
        int index = str.indexOf('l');  //
        System.out.println("Index of l = " + index); // str = "Hello";
        index = str.indexOf("or"); // с кокого индекса начинаеться подстрака "or"
        System.out.println(index);
        index = str.indexOf('l', 4); // ищем 'l', начиная с четвертого индекса
        System.out.println(index);
        index = str.lastIndexOf('l'); // индекс последнего нахождения 'l'
        System.out.println(index);
        index = str.indexOf('A'); // ищем индекс отсутствующей буквы
        System.out.println(index); // получаем -1
        System.out.println("--------------------");
        System.out.println(str.substring(4)); // печатаем подстроку с выбраного индекса
        System.out.println(str.substring(1,8)); // печатаем подстроку с выбраного индекса до выбраного индекса
        System.out.println(str.replace("o", "o-o-o")); //  замена
        System.out.println("--------------------");
        String str4 = "          Bill          ";// удаление пробелов
        System.out.println(str4);
        str4 = str4.trim();
        System.out.println(str4);
        System.out.println("--------------------");
        String str5 = "I love String in Java!";
        String[] words = str5.split(" ");// разделяем строку на элементы массива типа String
        System.out.println("Quantity of words in string: " + words.length); // узнали длину массива
        System.out.println(Arrays.toString(words));// напечатали массив
        System.out.println("--------------------");
        String str6 = "Ку-ку-ку";
        String[] letters = str6.split(""); // разделитель отсутствует, чтобы получить буквы
        System.out.println("Quantity of letters in string: " + letters.length); // узнали длину массива
        System.out.println(Arrays.toString(letters));// напечатали массив




    }
}

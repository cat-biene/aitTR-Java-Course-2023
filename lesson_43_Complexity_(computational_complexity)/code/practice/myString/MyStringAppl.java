package practice.myString;

import java.util.Iterator;

public class MyStringAppl {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("To be or not to be");
        MyString myString = new MyString(str);

        Iterator<Character> iterator = myString.iterator();

        while (iterator.hasNext()) {
            char ch = iterator.next();
            if(ch == 'e') { // удалили все буквы
                iterator.remove();
            }
        }
        System.out.println(myString);

        /*myString.addChar('!');
        System.out.println(myString);
        myString.removeChar('r');
        System.out.println(myString);
        myString.removeChar('o');
        System.out.println(myString);

        // напечатаем всю строку большими буквами
        StringBuilder builder = myString.getStr(); // в переменую builder забрали содержимое
        for (int i = 0; i < builder.length(); i++) {
            char c = builder.charAt(i);
            c = Character.toUpperCase(c);
            System.out.print(c);
        }

        // другой програмист делает:
        System.out.println();
        builder.setLength(5); // обрезали длину строки
        System.out.println(builder); // напечатали
        System.out.println(myString); // изменилась исходнная строка - это плохо!!! */

    }
}

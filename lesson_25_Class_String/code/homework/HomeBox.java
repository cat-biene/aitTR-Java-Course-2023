package homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeBox {
    public static void main(String[] args) {

        // Напишите программу, которая запрашивает строку от пользователя и затем:
        // сообщает сколько слов в строке
        // сообщает сколько букв (символов) в строке
        //  печатает строку задом наперед, начиная с последнего слова.

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input the number String: ");
        String str5 = scanner.nextLine();
        System.out.println("Ok! Thank you!");
        String[] wor = str5.split(" ");
        System.out.println("Quantity of words in your string:" + wor.length);
        System.out.println(Arrays.toString(wor));
        String[] let = str5.split("");
        System.out.println("Quantity of letters in your string: " + let.length);
        System.out.println(Arrays.toString(let));
        for (int i = wor.length - 1; i >= 0 ; i--) {
            System.out.println(wor[i] + " ");
        }
        System.out.println();
    }
}

package practice;

public class Division {

    public static void main(String[] args) {
        // деление целых чисел:
        // - / - челая часть от деления m на n;
        // - % - остаток от деления m на n;

        int m = 100;
        int n = 7;

        int c = m/n; // = - это присвоение

        System.out.println(c);

        int ost = m % n;

        System.out.println(ost);

        int a = 27;
        int b = 9;

        ost = a % b;

        System.out.println(ost);
        // когда одно целое число делиться на другое, то остаток от деления = 0

    }

}

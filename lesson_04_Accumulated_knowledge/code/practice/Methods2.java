package practice;

public class Methods2 {

    public static void main(String[] args) {

        int a = 41;
        int n = divBy2(a);
        System.out.println(n);

        int b = 83;
        int m = divBy5(b);
        System.out.println(m);

        int number = 99;
        int res = sumDigits(number);
        System.out.println(res);


    }

    public static int sumDigits(int n) {
        // получить первую цифру
        int c1 = n / 10;
        // получить вторую цифру
        int c2 = n % 10;
        // сложить цифры
        return c1 + c2;

    }

    public static int divBy5(int num) {
        return num / 5;

    }

    public static int divBy2(int a) {
        return a % 2;

    }

}

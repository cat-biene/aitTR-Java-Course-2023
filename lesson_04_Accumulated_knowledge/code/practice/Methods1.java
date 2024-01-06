package practice;

public class Methods1 {
    // 1. Создайте метод, который вычисляет
    // 2.
    // 3.

    public static void main(String[] args) {

        int a, b; // определяем нужные нам переменные
        a = 3;
        b = 4;
        int c = hipotenusa(a, b); // квадрат гипотенузы
        System.out.println(c);

        int d = - 46;
        int mod = modul(d); // смена знака числа
        System.out.println(mod);

        int f = 20;
        int kub = cub (f); // куб числа
        System.out.println(kub);

    }

    public static int cub(int x) {
        return x * x * x;
    }

    public static int modul(int d) {
        return -d;

    }

    public static int hipotenusa(int a, int b) {
        return a * a + b * b;

    }

}

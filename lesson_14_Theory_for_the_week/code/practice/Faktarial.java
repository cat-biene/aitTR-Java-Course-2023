package practice;
// Вводится n - натуральное число. Напишите метод,
// который получает на вход n и вычисляет n! = 1 * 2 * 3 *... * n.
// Вызовите полученный метод.
// При каком значении n происходит переполнение памяти, выделяемой для n типа int?
// Использовать цикл for.

public class Faktarial {

    public static void main(String[] args) {

        int n = 32;
        int f = factorial(n);
        System.out.println(" Factorial " + n + " = " + f);
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}

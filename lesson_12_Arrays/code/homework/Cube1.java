package homework;

// Бросьте кубик с 6-ю гранями 20 раз.
// Подсчитайте, сколько раз выпала каждая цифра.
public class Cube1 {

    public static void main(String[] args) {

        int[] cube = new int[20]; // создаем массив
        int a = 1;
        int b = 6;

        fillingArray(cube, a, b); // вызов метода - заполняем массив
        printArray(cube); // вызов метода - печатает в консоли
        System.out.println("=============================================================================");

        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        for (int i = 0; i < cube.length; i++) { // запускаем цикл
            if (cube[i] == 1) { // подсчитываем сколько раз выпала каждая сторона
                c++;
            } else if (cube[i] == 2) {
                d++;
            } else if (cube[i] == 3) {
                e++;
            } else if (cube[i] == 4) {
                f++;
            } else if (cube[i] == 5) {
                g++;
            } else if (cube[i] == 6) {
                h++;
            }

        }

        System.out.println(" Side c(1) is " + c ); // печатаем сколь раз выпала каждая сторона
        System.out.println(" Side d(2) is " + d );
        System.out.println(" Side e(3) is " + e );
        System.out.println(" Side f(4) is " + f );
        System.out.println(" Side g(5) is " + g );
        System.out.println(" Side h(6) is " + h );

    }

    public static void printArray(int[] arr) { // метод - печатаем в консолии
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

        }

        System.out.println();
    }

    public static void fillingArray(int[] arr, int a, int b) { // метод для получения случайных целых чисел
        for (int i = 0; i < arr.length; i++) { // запускаем цикл
            arr[i] = (int) (Math.random() * (b - a + 1) + a); // получаем случайные целые числа от1 до 6

        }

    }

}

package practice;

public class Maximum {

    public static void main(String[] args) {

        int a = -20;
        int b = -50;

        int max = maximum(a, b);
        System.out.println("Максимум это: " + max);

        int c = 60;
        int max3 = maximum3(a, b, c);
        System.out.println("Максимум из трех чисел это: " + max3);

    }

    public static int maximum(int a, int b) {
        int max = 0;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;

    }

    public  static  int maximum3(int a, int b, int c) {
        int max3 = 0;

        if(a > b && a > c) {
            max3 = a;
        }
        if(b > a && b > c) {
            max3 = b;
        }
        if(c > a && c > b) {
            max3 = c;
        }
        return max3;
    }

}

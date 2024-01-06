package homework;

public class Square {

    public static void main(String[] args) {

        // area of a square S = a * a
        double sideLength = a(); // side of a square
        printA(sideLength);
        double area = calculateSquareAre(sideLength);
        System.out.println("Площадь квадрата = " + area);
    }

    public static double calculateSquareAre(double sideLength) {
        double area = sideLength * sideLength;
        return area;
    }

    public static void printA(double A) {
        System.out.println("a = " + A);
    }

    public static double a() {
        double a = 5;
        return a;
    }
}

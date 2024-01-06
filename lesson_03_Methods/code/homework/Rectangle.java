package homework;

public class Rectangle {
    public static void main(String[] args) {

        // area of a rectangle S = a * b
        double sideLengthA = a();
        printA(sideLengthA);
        double sideLengthB = b();
        printB(sideLengthB);
        double area = calculateRectangleArea(sideLengthA, sideLengthB);
        System.out.println("Площадь прямоугольника = " + area);
    }

    public static double calculateRectangleArea(double sideLengthA, double sideLengthB) {
        double area = sideLengthA * sideLengthB;
        return area;
    }

    public static void printA(double A) {
        System.out.println("a = " + A);
    }

    public static void printB(double B) {
        System.out.println("b = " + B);
    }

    public static double b() {
        double b = 7;
        return b;
    }

    public static double a() {
        double a = 5;
        return a;
    }
}

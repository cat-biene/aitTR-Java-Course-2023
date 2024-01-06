package homework;

public class Triangle {
   // Написать приложение,
    // которое вычисляет площадь треугольника по его основанию
    // и высоте.

    public static void main(String[] args) {

        double tBase = 20;
        double tHeight = 10;
        double sTriangle = triangleArea(tBase, tHeight);
        System.out.println("Triangle area is " + sTriangle);

    }

    public static double triangleArea(double a, double h) {
        return a * h / 2;
    }

}

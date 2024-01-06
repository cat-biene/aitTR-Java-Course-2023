package homework;

public class Cube {
    // Написать приложение, которое вычисляет объем куба по длине его ребра и площадь его поверхности.


    public static void main(String[] args) {
        double edge = 10; // cube edge
        double vCube = volumeCube(edge);
        System.out.println("Cube volume = " + vCube);

        double edgeC = 5;
        double sCube = cubeArea(edgeC);
        System.out.println("Cube area = " + sCube);
    }

    public static double cubeArea(double b) {
        return 6 * b * b;
    }

    public static double volumeCube(double a) {
        return a * a * a;
    }

}

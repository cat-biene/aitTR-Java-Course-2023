package homework.cube.model;
// Создать класс Cube, описывающий куб cо стороной a.
// Реализовать в нем методы определения периметра p (сумма длин всех ребер),
// площади s (сумма площадей всех граней) и объема v.
// Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
// Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.

public class Cube {

    // class fields
    private double a;

    // class constructor
    public Cube(double a) {
        this.a = a;
    }

    // getter and setter

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    // method display
    public void display() {
        System.out.println(" a: " + a);
    }

    // method perimeter p
    public double perimeter() {
        double p = 12 * a;
        return p;
    }

    // method square s
    public double square() {
        double s = 6 * a * a;
        return s;
    }

    // metho volume v
    public double volume() {
        double v = a * a * a;
        return v;
    }
}

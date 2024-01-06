package homework.equation.model;
// Создать класс QuadraticEquation в пакете equation.model.
// В этом классе определить поля private double a; private double b; private double c;.
// Создать конструктор public QuadraticEquation(double a, double b, double c) для инициализации полей.
// Создать геттеры и сеттеры.
// Создать метод public void display() для печати в консоль квадратного уравнения.
// Создать методы public double delta() и public int quantityRoots()
// для вычисления дискриминанта и количества решений уравнения соответственно.

public class QuadraticEquation {

    // class fields
    private double a;
    private double b;
    private double c;

    // class constructor
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // getter and setter

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    // method display
    public void display() {
        System.out.println(" a: " + a + " b: " + b + " c: " + c);
    }

    // Method for calculating the discriminant
    public double delta() {
        return (b * b) - (4 * a * c);
    }

    // Method for calculating the number of solutions
    public int quantityRoots() {
       double discriminant = delta();
       if (discriminant > 0) {
           return 2;
       } else if (discriminant == 0) {
           return 1;
       } else {
           return 0;
       }
    }
}

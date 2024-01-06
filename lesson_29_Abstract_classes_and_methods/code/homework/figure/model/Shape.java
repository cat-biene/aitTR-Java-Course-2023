package homework.figure.model;
// Создайте абстрактный класс Shape с типом поля double (одно)
// и абстрактными методами calcArea и calcPerimeter.
// Создать классы Circle, Triangle, Square,
// расширяющие класс Shape и реализующие абстрактные методы.
// Напишите класс FigureAppl с методом main.
// В методе создайте массив фигур.
// Добавьте в массив два круга, один треугольник и один квадрат.
// Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

public abstract class Shape {

    //fields
    protected double side;

    //constructor
    public Shape(double side) {
        this.side = side;
    }

    //getter and setter
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // equals and hashCode
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Shape shape = (Shape) object;

        return Double.compare(side, shape.side) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(side);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Shape");
        stringBuilder.append("side: ").append(side);
        return toString();
    }

    // abstract method calcArea;
    public abstract double calcArea();

    //abstract method calcPerimeter
    public abstract double calcPerimeter();
}

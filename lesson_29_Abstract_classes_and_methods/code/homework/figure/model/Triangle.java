package homework.figure.model;
// Создайте абстрактный класс Shape с типом поля double (одно)
// и абстрактными методами calcArea и calcPerimeter.
// Создать классы Circle, Triangle, Square,
// расширяющие класс Shape и реализующие абстрактные методы.
// Напишите класс FigureAppl с методом main.
// В методе создайте массив фигур.
// Добавьте в массив два круга, один треугольник и один квадрат.
// Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

import homework.figure.model.Shape;

public class Triangle extends Shape {

    //fields
    protected double height;


    //constructor
    public Triangle(double side, double height) {
        super(side);
        this.height = height;
    }

    // getter and setter
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        double area = 1 / 2 * side * height;
        return area;
    }

    @Override
    public double calcPerimeter() {
        double perimeter = 3 * side;
        return perimeter;
    }

}





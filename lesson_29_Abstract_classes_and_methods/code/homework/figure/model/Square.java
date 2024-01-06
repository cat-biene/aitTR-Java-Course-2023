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

public class Square extends Shape {

    // constructor
    public Square(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        double area = side * side;
        return area;
    }

    @Override
    public double calcPerimeter() {
        double perimeter = 4 * side;
        return perimeter;
    }
}

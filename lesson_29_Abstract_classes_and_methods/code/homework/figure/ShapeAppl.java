package homework.figure;
// Создайте абстрактный класс Shape с типом поля double (одно)
// и абстрактными методами calcArea и calcPerimeter.
// Создать классы Circle, Triangle, Square,
// расширяющие класс Shape и реализующие абстрактные методы.
// Напишите класс FigureAppl с методом main.
// В методе создайте массив фигур.
// Добавьте в массив два круга, один треугольник и один квадрат.
// Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

import homework.figure.model.Circle;
import homework.figure.model.Shape;
import homework.figure.model.Square;
import homework.figure.model.Triangle;

public class ShapeAppl {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5);
        shapes[1] = new Circle(8.5);
        shapes[2] = new Triangle(3, 2.5);
        shapes[3] = new Square(7);

        double totalArea = totalArea(shapes);
        System.out.printf("Total area = %.2f", totalArea);
        System.out.println();
        double totalPerimeter = totalPerimeter(shapes);
        System.out.println("Total perimeter = " + totalPerimeter);
        System.out.println();
        double totalAreaCircle = totalAreaCircle(shapes);
        System.out.printf("Total area circle = %.2f",totalAreaCircle);
    }

    private static double totalArea(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                sum += shapes[i].calcArea();
            }
        }
        return sum;
    }

    private static double totalPerimeter(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                sum += shapes[i].calcPerimeter();
            }
        }
        return sum;
    }

    // Рассчитайте общую площадь кругов из задачи 2.
    public static double totalAreaCircle(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) { // проверяем условие: элемент являеться экземпляром круг Circle
                sum += ((Circle)shapes[i]).calcArea(); // расчитываем площадь для элементов, которые являються Circle
            }
        }
        return sum;
    }
}


package homework;

public class Check {
    // Задать в программе три стороны треугольника.
    // Проверить выполнимость неравенства треугольника
    // Любая из сторон должна быть меньше суммы двух других.
    // Сообщить результат - существует или
    // нет треугольник с заданными сторонами.


    public static void main(String[] args) {

      double sideA = 10;
      double sideB = 10;
      double sideC = 5;
      boolean isTriangle = checkTriangle(sideA, sideB, sideC);

      if (isTriangle) {
          System.out.println("Треугольник с задаными сторонами существует. ");
      } else {
          System.out.println("Треугольник с задаными сторонами не существует.");
      }

    }

    public static boolean checkTriangle(double sideA, double sideB, double sideC) {
        return (sideA < sideB + sideC) && (sideB < sideA + sideC) && (sideC < sideA + sideB);

    }

}
package homework.cube;
// Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
// Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.

import homework.cube.model.Cube;

public class CubeAppl {

    public static void main(String[] args) {

        Cube cube1 = new Cube(5);
        Cube cube2 = new Cube(9);
        Cube cube3 = new Cube(2.5);

        cube1.display();
        cube1.perimeter();
        System.out.println(" Perimeter cube1 is " + cube1.perimeter());
        cube1.square();
        System.out.println(" Square cube1 is " + cube1.square());
        cube1.volume();
        System.out.println(" Volume cube1 is " + cube1.volume());

        cube2.display();
        cube2.perimeter();
        System.out.println(" Perimeter cube2 is " + cube2.perimeter());
        cube2.square();
        System.out.println(" Square cube1 is " + cube2.square());
        cube2.volume();
        System.out.println(" Volume cube1 is " + cube2.volume());

        cube3.display();
        cube3.perimeter();
        System.out.println(" Perimeter cube3 is " + cube3.perimeter());
        cube3.square();
        System.out.println(" Square cube3 is " + cube3.square());
        cube3.volume();
        System.out.printf(" Volume cube3 is %.2f", cube3.volume());

    }
}

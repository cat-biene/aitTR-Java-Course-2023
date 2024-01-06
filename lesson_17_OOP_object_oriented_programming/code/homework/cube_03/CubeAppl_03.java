package homework.cube_03;

import homework.cube_03.model.Cube_03;

public class CubeAppl_03 {

    public static void main(String[] args) {

        Cube_03 cube1 = new Cube_03(10);
        Cube_03 cube2 = new Cube_03(20);
        Cube_03 cube3 = new Cube_03(100);

        System.out.println(cube1.perimeter(cube1.getA()));
        System.out.println(cube2.perimeter(cube2.getA()));
        System.out.println(cube3.perimeter(cube3.getA()));
        System.out.println("------------------------");
        System.out.println(cube1.square(cube1.getA()));
        System.out.println(cube2.square(cube2.getA()));
        System.out.println(cube3.square(cube3.getA()));
        System.out.println("------------------------");
        System.out.println(cube1.volume(cube1.getA()));
        System.out.println(cube2.volume(cube2.getA()));
        System.out.println(cube3.volume(cube3.getA()));

    }
}

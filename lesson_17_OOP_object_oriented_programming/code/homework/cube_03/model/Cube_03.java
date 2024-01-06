package homework.cube_03.model;

public class Cube_03 {

    // поля класса
    int a;

    // конструктор
    public Cube_03(int a) {
        this.a = a;
    }

    // геттеры и сеттеры
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    // методы класса
    public int perimeter(int a) {
        return 12 * a;
    }

    public int square(int a) {
        return 6 * a * a;
    }

    public int volume(int a) {
        return a * a * a;
    }
}

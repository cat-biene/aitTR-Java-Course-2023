package homework.pet;
// Создайте дочерние от класса Pet классы Cat и Dog
// c дополнительными полями: порода, рост, вес.
// Создайте метод voice, который выдает "Мяу!" для класса Cat
// и "Гав-гав!" для класса Dog.
// Создайте HouseAppl, в котором есть метод main.
// оселите в доме 2 собаки и 3 кошки.
// Смоделируйте жизнь в этом доме в течение дня.

import homework.cube.model.Cube;
import homework.pet.model.Cat;
import homework.pet.model.Dog;

public class HouseAppl {

    public static void main(String[] args) {

        Cat cat1 = new Cat(1,"cat", 5, "Simka", "british", 55,4500);
        Cat cat2 = new Cat(2,"cat", 3,"Murka", "meykun", 60, 9000);
        Cat cat3 = new Cat(3, "cat", 10, "Baksik", "sfinx", 40, 4500);

        Dog dog1 = new Dog(1, "dog", 5, "Baron", "chivava", 30, 4500);
        Dog dog2 = new Dog(2, "dog", 4, "Maks", "labrador", 130, 45000);

        cat1.voiceCat();
        cat2.voiceCat();
        cat3.voiceCat();

        dog1.voiceDog();
        dog2.voiceDog();

        cat1.play();
        cat2.eat();
        cat3.sleep();

        dog1.eat();
        dog2.sleep();
    }
}

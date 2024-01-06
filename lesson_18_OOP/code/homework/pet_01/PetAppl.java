package homework.pet_01;

import homework.pet_01.model.Cat_01;
import homework.pet_01.model.Dog_01;

public class PetAppl {

    public static void main(String[] args) {

        Cat_01 cat = new Cat_01(1, "cat ", 2, "Murka", "brit", 5, 30);
        Dog_01 dog = new Dog_01(2, "dog ", 3, "Redy", "pudel", 6, 40 );

        cat.display();
        cat.voice();
        dog.display();
        dog.voice();

    }
}

package homework.pet_01;

import homework.pet_01.model.Pet_01;
import homework.pet_01.model.Pet_1;

public class PetAppl_01 {

    public static void main(String[] args) {

        Pet_01 cat = new Pet_01(1, " Cat ", 2, "Murka");
        Pet_01 dog = new Pet_01(2, " Dog ", 5, "Buran");

        cat.display();
        cat.thereIs();
        cat.sleep();
        cat.eat();
        cat.play();
        dog.makeSound();
        cat.bite();
    }

}

package homework.pet;
// В классе PetAppl создать несколько экземпляров домашних животных.
// Отобразить прожитый день.

import homework.pet.model.Pet1;

public class PetAppl {

    public static void main(String[] args) {
        Pet1 pet1 = new Pet1(1, "dog", 2, "Sharik");
        Pet1 pet2 = new Pet1(2, "cat", 10, "Murka");
        Pet1 pet3 = new Pet1(3, "cat",3, "Simka");

        pet1.displayPet();
        pet2.displayPet();
        pet3.displayPet();

        String name = pet1.getName();
        System.out.println(name);
        pet1.eat();
        pet1.play();
        pet1.makeSound();
        pet1.walk();
        pet1.sleep();

        pet2.eat();
        pet2.sleep();

        pet3.eat();
        pet3.play();
        pet3.walk();
        pet3.sleep();
    }

}

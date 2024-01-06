package consultation.zoo;

/**
 * @author Andrej Reutow
 * created on 16.10.2023
 */
public class Zoo {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Vasja"),
                new Cat("Tom"),
                new Dog("Rex"),
                new Dog("Tusik")
        };

        for (int i = 0; i < animals.length; i++) {
            Animal currentAnimal = animals[i];
            currentAnimal.makeSound();
        }
    }
}

package consultation.zoo;

/**
 * @author Andrej Reutow
 * created on 16.10.2023
 */
public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}

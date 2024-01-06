package consultation.zoo;
import consultation.zoo.Animal;
/**
 * @author Andrej Reutow
 * created on 16.10.2023
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog with name: " + this.name + " make gaw gaw");
    }
}

package consultation.zoo;
import consultation.zoo.Animal;
/**
 * @author Andrej Reutow
 * created on 16.10.2023
 */
public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat with name: " + this.name + " make may may");
    }
}

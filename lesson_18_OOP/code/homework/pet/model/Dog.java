package homework.pet.model;
// Создайте дочерние от класса Pet классы Cat и Dog
// c дополнительными полями: порода, рост, вес.
// Создайте метод voice, который выдает "Мяу!" для класса Cat
// и "Гав-гав!" для класса Dog.
// Создайте HouseAppl, в котором есть метод main.
// оселите в доме 2 собаки и 3 кошки.
// Смоделируйте жизнь в этом доме в течение дня.

public class Dog extends Pet1 {

    // field
    private String breed;
    private double height;
    private double weight;

    // constructor
    public Dog(int id, String type, int age, String name, String breed, double height, double weight) {
        super(id, type, age, name);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    //getter an setter
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // method voice
    public void voiceDog() {
        System.out.println(" Dog : " + getName() + " Way!");
    }
}

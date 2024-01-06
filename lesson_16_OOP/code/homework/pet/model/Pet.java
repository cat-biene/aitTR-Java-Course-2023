package homework.pet.model;
// Создать класс Pet (Домашнее животное) с приватными полями:
// id
// вид
// возраст
// кличка
// Стандартные методы:
// конструктор на все поля;
// геттеры и сеттеры на все поля;
// метод toString.
// Дополнительные методы:
// спать
// есть
// делать звук
// играть
// гулять

public class Pet {
    // class fields (поля конструктора)
    private int id;
    private String type;
    private int age;
    private String name;

    // class constructor
    public Pet(int id, String type, int age, String name) {
        this.id = id;
        this.type = type;
        this.age = age;
        this.name = name;
    }

    // get and set
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void displayPet() {
        System.out.println(" Id: " + id + " Type: " + type + " Age: " + age + " Name: " + name);
    }
    public void sleep() {
        System.out.println(name + " is sleeping. ");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
    public void makeSound() {
        System.out.println(name + " is making a sound. ");
    }
    public void play() {
        System.out.println(name + " is playing. ");
    }
    public void walk() {
        System.out.println(name + " is walking.  ");
    }

}

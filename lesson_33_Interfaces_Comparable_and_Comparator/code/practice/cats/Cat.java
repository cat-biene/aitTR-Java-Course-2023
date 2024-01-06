package practice.cats;

public class Cat implements Comparable<Cat>{

    // fields
    private int id;
    private String name;
    private String breed;
    private int age;
    private double weight;

    // constructor
    public Cat(int id, String name, String breed, int age, double weight) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    // getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Cat cat = (Cat) object;

        return id == cat.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    // этот метод позволяет проводить сравнения объекта этого класса
    // он сравнивает текущий объект(this) с Cat o
    // он возвращает целое числою Если оно > 0, то объект меняют местами, в остальных случаях - оставляем как есть
    @Override
    public int compareTo(Cat o) {
        int res = this.age - o.age; // сравнили года двух объектов - this и o
        return res;
    }
}

package homework.pet_01.model;

public class Cat_01 extends Pet_1 {

    private String breed;
    private double weight;
    private double height;

    public Cat_01(int id, String kind, int age, String nickname, String breed, double weight, double height) {
        super(id, kind, age, nickname);
        this.breed = breed;
        this.weight = weight;
        this.height = height;
    }

    public void voice(){
        System.out.println("Meau, meau!");
    }

}

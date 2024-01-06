package consultation;

public class Suv extends Auto{

    private int power;

    public Suv(String model, String color, int power) {
        super(model, color);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}

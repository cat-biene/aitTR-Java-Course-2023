package consultation;

/**
 * @author Andrej Reutow
 * created on 02.10.2023
 */
public class Auto {

    private String model;
    private String color;

    public Auto(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

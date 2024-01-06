package consultation;

import java.util.Objects;

/**
 * @author Andrej Reutow
 * created on 05.10.2023
 */
public class Pen extends Product { // ручка

    private String color;

    public Pen(int id, double price, String name, String color) {
        super(id, price, name);
        this.color = color;
    }

    @Override
    public void cost() {
        System.out.println("Ручка " + this.brand + " стоит " + getPrice() + " euro");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        if (!super.equals(object)) return false;

        Pen pen = (Pen) object;

        return Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }
}

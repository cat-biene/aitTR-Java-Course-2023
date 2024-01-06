package consultation;

import java.util.Objects;

/**
 * @author Andrej Reutow
 * created on 05.10.2023
 */
public class Meat extends Product {

    private String type;

    public Meat(int id, double price, String brand, String type) {
        super(id, price, brand);
        this.type = type;
    }

    @Override
    public void cost() {
        System.out.println("Мясо " + this.brand + " стоит " + getPrice() + " euro");
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Meat meat = (Meat) object;

        return Objects.equals(type, meat.type);
    }

    @Override
    public int hashCode() {
        return type != null ? type.hashCode() : 0;
    }
}

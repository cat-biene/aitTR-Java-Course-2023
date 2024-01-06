package homework.container;

import java.util.Objects;

public class Parcel {

    // fields
    double weight = 2;

    // constructor
    public Parcel(double weight) {
        this.weight = weight;
    }

    // getter
    public double getWeight() {
        return weight;
    }

    // methods equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parcel parcel = (Parcel) o;
        return Double.compare(weight, parcel.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }
}

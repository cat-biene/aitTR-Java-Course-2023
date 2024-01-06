package homework.containerClass;

public class ParcelC {
    double weight;

    public ParcelC(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nParcel have " + weight + "kg";
    }
}



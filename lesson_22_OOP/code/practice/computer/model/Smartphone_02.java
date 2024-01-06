package practice.computer.model;

public class Smartphone_02 extends Laptop_02{

    private long imei;

    public Smartphone_02(String cpu, int ram, int ssd, String brand, double hours, double weight, long imei) {
        super(cpu, ram, ssd, brand, hours, weight);
        this.imei = imei;
    }

    public long getImei() {
        return imei;
    }

    public String toString() {
        return super.toString() + ", IMEI: " + imei;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Smartphone_02)) {
            return false;
        }
        Smartphone_02 other = (Smartphone_02) object;
        return imei == other.imei;
    }
}

package ait.model;

public class Smartphone_01 extends Laptop_01{

    private long imei;

    public Smartphone_01(String cpu, int ram, int ssd, String brand, double hours, double weight, long imei) {
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
        if (!(object instanceof Smartphone_01)) {
            return false;
        }
        Smartphone_01 other = (Smartphone_01) object;
        return imei == other.imei;
    }
}

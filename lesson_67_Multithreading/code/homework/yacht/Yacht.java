package homework.yacht;

import java.time.LocalDate;
import java.util.Objects;

// Create a class "Yacht". The class must store the following information:
//
//manufacturer (shipyard);
//year of issue;
//length;
//body material (wood, plastic, metal);
//price.
//You need to create a set of yachts and complete the following tasks:
//
//display all yachts;
//display yachts made from the specified hull material;
//display yachts more expensive than the specified price;
//display yachts whose year of manufacture is in a given range;
//sort yachts in descending order of cost;
//get the average cost of a yacht from the created set.
public class Yacht {

    // fields
    String manufacturer;
    LocalDate date;
    double length;
    String bodyMaterial;
    double price;

    // constructor
    public Yacht(String manufacturer, LocalDate date, double length, String bodyMaterial, double price) {
        this.manufacturer = manufacturer;
        this.date = date;
        this.length = length;
        this.bodyMaterial = bodyMaterial;
        this.price = price;
    }

    //getter
    public String getManufacturer() {
        return manufacturer;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getLength() {
        return length;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Yacht yacht = (Yacht) o;
        return Double.compare(length, yacht.length) == 0 && Double.compare(price, yacht.price) == 0 && Objects.equals(manufacturer, yacht.manufacturer) && Objects.equals(date, yacht.date) && Objects.equals(bodyMaterial, yacht.bodyMaterial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, date, length, bodyMaterial, price);
    }

    @Override
    public String toString() {
        return "Yacht{" +
                "manufacturer='" + manufacturer + '\'' +
                ", date=" + date +
                ", length=" + length +
                ", bodyMaterial='" + bodyMaterial + '\'' +
                ", price=" + price +
                '}';
    }
}


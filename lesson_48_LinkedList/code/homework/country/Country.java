package homework.country;

import java.util.Objects;

public class Country implements Comparable<Country>{

    // Создайте класс Country со следующими полями:
    //
    // название;
    // население(в млн.);
    // континент. Создайте связный список, содержащий 11 стран из разных континентов.
    // Получите списки этих стран, отсортированные по:
    // алфавиту;
    // по размеру населения в стандартном и обратном порядках;
    // принадлежности континенту и размеру населения в порядке от большего к меньшему.

    // fields of class
     private String nameCountry;
     private long populationCountry;
     private String continent;

     // constructor
    public Country(String nameCountry, long populationCountry, String continent) {
        this.nameCountry = nameCountry;
        this.populationCountry = populationCountry;
        this.continent = continent;
    }

    // getter and setter

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public long getPopulationCountry() {
        return populationCountry;
    }

    public void setPopulationCountry(long populationCountry) {
        this.populationCountry = populationCountry;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    // method toString
    @Override
    public String toString() {
        return "Country{" +
                "nameCountry='" + nameCountry + '\'' +
                ", populationCountry=" + populationCountry +
                ", continent='" + continent + '\'' +
                '}';
    }

    // method equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return populationCountry == country.populationCountry && Objects.equals(nameCountry, country.nameCountry) && Objects.equals(continent, country.continent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCountry, populationCountry, continent);
    }

    // method compareTo for sorting by name
    @Override
    public int compareTo(Country o) {
        return this.nameCountry.compareTo(o.nameCountry);
    }
}

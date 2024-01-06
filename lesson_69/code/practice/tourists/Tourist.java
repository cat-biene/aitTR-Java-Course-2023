package practice.tourists;

import java.util.Arrays;

public class Tourist {

    // we need the tourist and the country where he was

    // fields
    private String name;
    String[] countries;

    // constructor
    public Tourist(String name, String... countries) {
        this.name = name;
        this.countries = countries;
    }

    // getter
    public String getName() {
        return name;
    }

    public String[] getCountries() {
        return countries;
    }

    // method toString
    @Override
    public String toString() {
        return "Tourist{" +
                "name='" + name + '\'' +
                ", countries=" + Arrays.toString(countries) +
                '}';
    }
}

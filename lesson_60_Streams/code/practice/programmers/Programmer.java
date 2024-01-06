package practice.programmers;

import java.util.Arrays;

public class Programmer {
    // В этом классе нужно учесть состав и количество языков программирования, которые знает программист (technology).
    // чем больше языков, тем "круче"

    // fields
    String name;
    String[] technologies; // стек технологий

    // constructor
    public Programmer(String name, String... technologies) { // "varards" (variable arguments) - позволяет использовать массив разной длины
        this.name = name;
        this.technologies = technologies;
    }

    // getter
    public String getName() {
        return name;
    }

    public String[] getTechnologies() {
        return technologies;
    }

    // method toString
    @Override
    public String toString() {
        return "Programmers{" +
                "name='" + name + '\'' +
                ", technologies=" + Arrays.toString(technologies) +
                '}';
    }
}

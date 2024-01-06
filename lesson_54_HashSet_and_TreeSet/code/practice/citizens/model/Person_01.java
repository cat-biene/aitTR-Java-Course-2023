package practice.citizens.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person_01 implements Comparable<Person_01> {

    //fields
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    // constructor
    public Person_01(int id, String firstName, String lastName, LocalDate birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    // getter
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        // определение возраста человека
        LocalDate currentDate = LocalDate.now(); // создаем объект, представляющий текущую дату
        int age = (int) ChronoUnit.YEARS.between(this.birthDate, currentDate); // Эта строка вычисляет разницу в годах между датой рождения
        // (birthDate) и текущей датой (currentDate).
        // ChronoUnit.YEARS.between возвращает количество лет между двумя датами.
        // Результат приводится к целому числу (int), так как возраст обычно представляется целым числом.
        return age; // возвращаем возраст
    }

    // setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //  methods equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person_01 person = (Person_01) o;

        return id == person.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    // method toString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Person_01 person) {
        return Integer.compare(id, person.id);
    }
}

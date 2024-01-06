package consultation.model;

import java.time.LocalDate;
import java.util.Objects;

public class User implements Comparable<User>{

    private String name;
    private String lastName;
    private int id;
    private int age;
    private String email;
    private String password;
    private LocalDate birthDay;

    public User(String name, String lastName, int id, int age, String email, String password, LocalDate birthDay) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
        this.email = email;
        this.password = password;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(User o) {
        return Integer.compare(id, o.id);
    }
}

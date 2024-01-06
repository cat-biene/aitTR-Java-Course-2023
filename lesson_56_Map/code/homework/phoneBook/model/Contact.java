package homework.phoneBook.model;

import java.util.Objects;
// 1. Создание класса Contact:
//Класс, представляющий контакт, должен содержать поля для имени и телефона.
//Конструктор, геттеры, сеттеры и другие методы по необходимости.
//
//2. Создание класса PhoneBook:
//Класс, управляющий контактами, который будет содержать ArrayList для хранения контактов.
//Методы для добавления, вывода, поиска и удаления контактов.
//
//3. Создание основного класса приложения:
//В основном классе мы будем использовать объект класса PhoneBook для взаимодействия с контактами.
public class Contact implements Comparable<Contact>{

    // fields of class
    private String name;
    private String numberPhone;

    // constructor
    public Contact(String name, String numberPhone) {
        this.name = name;
        this.numberPhone = numberPhone;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    // method toString
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                '}';
    }

    // methods equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(numberPhone, contact.numberPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberPhone);
    }

    @Override
    public int compareTo(Contact contact) {
        int result = this.name.compareToIgnoreCase(contact.name);
        return result != 0 ? result : this.numberPhone.compareTo(contact.numberPhone);
    }
}

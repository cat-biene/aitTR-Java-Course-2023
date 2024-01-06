package homework.phoneBook.dao;

import homework.phoneBook.model.Contact;

import java.util.List;

public interface PhoneBook {

    boolean addContact(Contact contact); // добавление контакта
    void displayContact();// печатаем все контакты
    List<Contact> findContact(String name); // этот метод вернет лист контактов у которых найдется name (список)
    Contact deleteContact(Contact contact); // удаление из списка по контакту
}

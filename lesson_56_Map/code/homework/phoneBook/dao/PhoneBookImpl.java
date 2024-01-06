package homework.phoneBook.dao;

import homework.phoneBook.model.Contact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 2.Создание класса PhoneBook:
//Класс, управляющий контактами, который будет содержать ArrayList для хранения контактов.
//Методы для добавления, вывода, поиска и удаления контактов.
public class PhoneBookImpl implements PhoneBook {

    // fields of class
    private ArrayList<Contact> contacts;

    // constructor
    public PhoneBookImpl() {
        contacts = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            Collections.sort(contacts);
            return true; // Added successfully
        }
        return false;
    }

    public void displayContact() {
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + ": " + contact.getNumberPhone());
        }
    }

    public List<Contact> findContact(String name) {
        return contacts.stream()
                .filter(contact -> contact.getName().equalsIgnoreCase(name))
                .toList(); // TODO проверить , что список не пуст
    }

    // найти контакт, получить список с одинаковыми именами
    // в списке отфильтровать по номеру телефона
    public Contact deleteContact(Contact contact) {
        List<Contact> listForDelete = findContact(contact.getName()); // лист людей с одинаковыми именами
        Contact victim = listForDelete.stream()
                .filter(c -> c.getNumberPhone().equals(contact.getNumberPhone()))
                .findFirst()
                .orElse(null);

        contacts.remove(victim);
        return victim;
    }
}
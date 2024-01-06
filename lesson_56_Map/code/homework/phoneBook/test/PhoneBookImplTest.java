package homework.phoneBook.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import homework.phoneBook.dao.PhoneBook;
import homework.phoneBook.dao.PhoneBookImpl;
import homework.phoneBook.model.Contact;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookImplTest {

    List<Contact> contact = new LinkedList<>();
    PhoneBook phoneBook;

    @BeforeEach
    void setUp() {
        phoneBook = new PhoneBookImpl();
        contact.add(new Contact("Name1", "number1"));
        contact.add(new Contact("Name1", "number2"));
        contact.add(new Contact("Name2", "number3"));
        contact.add(new Contact("Name4", "number4"));
        contact.add(new Contact("Name3", "number5"));

        for (Contact cont : contact) {
            phoneBook.addContact(cont);
        }
        Collections.sort(contact);
        System.out.println();
    }

    @Test
    void addContactTest() {
        assertTrue(phoneBook.addContact(new Contact("Name7", "number7")));
        assertTrue(phoneBook.addContact(new Contact("Name8", "number6")));
        assertFalse(phoneBook.addContact(new Contact("Name1", "number1")));

        Collections.sort(contact);
        phoneBook.displayContact();
        System.out.println();
    }

    @Test
    void displayContactTest() {
        phoneBook.displayContact();
        System.out.println();
    }

    @Test
    void findContactTest() {
        List<Contact> contact = phoneBook.findContact("Name1");
        assertNotNull(contact);

        phoneBook.displayContact();
        System.out.println();
        System.out.println(contact);
        System.out.println();
    }

    @Test
    void deleteContactTest() {
        phoneBook.deleteContact(new Contact("Name1", "number1"));

        phoneBook.displayContact();
        System.out.println();
    }
}
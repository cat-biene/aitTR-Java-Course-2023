package homework.phoneBook;
// Методы для добавления, вывода, поиска и удаления контактов.

import homework.phoneBook.dao.PhoneBookImpl;
import homework.phoneBook.model.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBookAppl {

    public static void main(String[] args) {

        PhoneBookImpl phoneBook = new PhoneBookImpl();
        List<Contact> contact = new ArrayList<>();
        contact.add(new Contact("Leonid", "+123456789"));
        contact.add(new Contact("Ivan", "+236547891"));
        contact.add(new Contact("Andreas", "+365478921"));
        contact.add(new Contact("Vladislava", "+456987123"));
        contact.add(new Contact("Anton", "+569874123"));
        contact.add(new Contact("Sergey", "+698745333"));
        contact.add(new Contact("Evgenia", "+789654123"));
        contact.add(new Contact("Galina", "+897456321"));
        contact.add(new Contact("Tatiana", "+963258741"));
        contact.add(new Contact("Kirill Bott", "+159623487"));
        contact.add(new Contact("Elena", "+258963147"));
        contact.add(new Contact("Alex", "+369852147"));
        contact.add(new Contact("Anatoly", "+985632147"));
        contact.add(new Contact("Andrej", "+456982317"));
        contact.add(new Contact("Lubov", "+987654258"));
        contact.add(new Contact("Yaroslav", "+625184793"));
        contact.add(new Contact("Kirill Sokolov", "+123456589"));
        contact.add(new Contact("Sergey", "+123456888"));
        contact.add(new Contact("Artem", "+987654233"));
        contact.add(new Contact("Karolina", "+1237777789"));

        for (Contact c : contact) {
            phoneBook.addContact(c);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("PhoneBook");

        while (true) {

            System.out.println("Menu: ");
            System.out.println("1 - added contact");
            System.out.println("2 - display contacts");
            System.out.println("3 - find contact");
            System.out.println("4 - delete contact");
            System.out.println("0 - exit");
            System.out.println();


            int number = scanner.nextInt();
            scanner.nextLine();

            try {

                switch (number) {

                    case 1:
                        System.out.println("Input name: ");
                        String name = scanner.nextLine();
                        System.out.println("Input number phone: ");
                        String numberPhone = scanner.nextLine();
                        Contact newContact = new Contact(name, numberPhone);
                        phoneBook.addContact(newContact);
                        if (newContact != null) {
                            System.out.println("Contact added.");
                        } else {
                            System.out.println("Contact is not existed.");
                        }
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Contacts: ");
                        phoneBook.displayContact();
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Input name to find by contact; ");
                        String nameFind = scanner.nextLine();
                        List<Contact> foundContact = phoneBook.findContact(nameFind);
                        if (foundContact != null) {
                            System.out.println(foundContact);
                        } else {
                            System.out.println("contact is not existed.");
                        }
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Input name to delete by contact: ");
                        String nameDelete = scanner.nextLine();
                        System.out.println("Input phone number to delete by contact: ");
                        String numberP = scanner.nextLine();
                        phoneBook.deleteContact(new Contact(nameDelete, numberP));
                        if (nameDelete != null) {
                            System.out.println("Contact delete.");
                        } else {
                            System.out.println("Contact is not existed.");
                        }
                        System.out.println();
                        break;
                    case 0:
                        System.out.println("Exit");
                        System.out.println();
                        break;
                    default:
                        System.out.println("Wrong input.");
                        System.out.println();
                }
            } catch (Exception e) {
                System.out.println("An error occurred.");
                scanner.nextLine();
            }
        }
    }
}

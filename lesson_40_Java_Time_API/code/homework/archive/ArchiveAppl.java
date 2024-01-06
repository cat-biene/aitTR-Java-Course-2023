package homework.archive;

import homework.archive.dao.ArchiveImpl;
import homework.archive.model.Documents;
import homework.archive.model.Menu;

import java.time.LocalDateTime;
import java.util.Scanner;

// приложение ArchiveAppl, в котором должно быть меню с функциями:
// добавить документ (запрос id документа, id папки, названия документа, url, присвоение текущей даты и времени)
//показать список всех документов в архиве
//узнать количество хранимых документов в архиве
//выход
public class ArchiveAppl {

    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to Archive.");
        ArchiveImpl archive = new ArchiveImpl(100);
        LocalDateTime time = LocalDateTime.now();

        // начало цикла
        while (true) {
            // print menu
            Menu.printMenu(); // статический метод вызывается по имени класса
            // ask choice
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();
            // execute
            switch (choice) {
                case 1: {
                    scanner.nextLine();
                    System.out.println("Input folder ID: ");
                    int folderId = scanner.nextInt();
                    System.out.println("Input document ID: ");
                    int documentId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Input document title: ");
                    String title = scanner.nextLine();
                    System.out.println("Input document url: ");
                    String url = scanner.nextLine();
                    LocalDateTime currTime = LocalDateTime.now();
                    Documents document = new Documents(folderId, documentId, title, url, currTime);
                    archive.addDocuments(document);
                    break;
                }
                case 2: {
                    System.out.println("List of documents in Archive: ");
                    archive.size();
                    break;
                }
                case 3: {
                    System.out.println("Quantity of documents in Archive: ");
                    System.out.println(archive.size());
                    break;
                }
                case 4:
                    return;
                default: {
                    System.out.println("Wrong input.");
                }
            }
        }
    }

}

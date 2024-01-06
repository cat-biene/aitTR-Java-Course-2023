package homework;

import homework.model.Document_01;
import homework.model.Menu_01;
import homework.dao.ArchiveImpl_01;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ArchiveAppl_01 {
    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to Archive.");
        ArchiveImpl_01 archive = new ArchiveImpl_01(100);
        LocalDateTime time = LocalDateTime.now();

        // начало цикла
        while (true) {
            // print menu
            Menu_01.printMenu(); // статический метод вызывается по имени класса
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
                    scanner.nextLine(); // переход на новую строку и ожидание ввода
                    System.out.println("Input document title: ");
                    String title = scanner.nextLine();
                    System.out.println("Input document url: ");
                    String url = scanner.nextLine();
                    LocalDateTime currTime = LocalDateTime.now();
                    Document_01 document = new Document_01(folderId, documentId, title, url, currTime);
                    archive.addDocument(document);
                    break;
                }
                case 2: {
                    System.out.println("List of documents in Archive: ");
                    archive.viewArchive();
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

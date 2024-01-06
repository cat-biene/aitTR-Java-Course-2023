package practice.post_office;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//**Задача:** Написать приложение, которое позволит понять,
// из каких мест на данную почту приходят письма.
public class PostAppl {

    public static void main(String[] args) {

        //оператор будетвводить индексы из приходящих писем, будем  HashSet
        // в конце сменны - распечатать HashSet

        Set<String> postCode = new HashSet<>();
        do {
            System.out.println("Welcome to Post office.");
            Scanner scanner = new Scanner(System.in);
            // приглашение пользователю
            System.out.println("Input Post code: ");
            String newPostCode = scanner.nextLine();
            if(postCode.add(newPostCode)) {
                System.out.println("Post code added.");
            } else {
                System.out.println("Post code already exists.");
            }
            System.out.println("Continue? Press S to stop.");
            String chair = scanner.nextLine();
            if(chair.equalsIgnoreCase("s")) {
                break;
            }
        } while (true);

        System.out.println("Post codes: ");
        System.out.println(postCode);
    }
}

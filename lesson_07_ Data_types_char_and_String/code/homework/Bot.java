package homework;
// Написать бот, который задет не менее 3-х вопросов (последовательно),
// принимает ответы от пользователя и реагирует на эти ответы.
// Пример: Как вас зовут? Очень приятно, меня зовут Бот1.
// Какой у вас вес? 106 кг.
// А какой рост?we call you
// А какой возраст? ...
// Варианты ответов..., которые отвечает бот.

import java.util.Scanner;

public class Bot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //
        System.out.println(" Hello! My name is Bot!");
        System.out.println(" What is your first name?");
        String name = scanner.next();
        System.out.println(name + " What is your last name? ");
        String lastName = scanner.next();
        System.out.println(name + " " + lastName + ", nice to meet you!");
        System.out.println(" Where are you from (City), " + name + " ?");
        String city = scanner.next();
        if(city.equals("Berlin")) {
            System.out.println("Aw. Berlin is the capital of Germany.");
        } else if (city.equals("Munich")) {
            System.out.println("Munich is a beautiful town.");
        }
        System.out.println(name + " How old are you? ");
        int old = scanner.nextInt();
        scanner.nextInt();
        if(old > 7 && old < 18) {
            System.out.println(name + " where do you study?");
            String study = scanner.nextLine();
            if(study.equals("school")){
                System.out.println("Nice. " + name + " what is you favorite class?");
                String classes = scanner.nextLine();
                System.out.println(classes + " it is great!");
            } else if (study.equals("university")) {
                System.out.println("Great! " + name + " what is your major?");
                String major = scanner.next();
                System.out.println(major + " it is great!");
            }
        } else if (old > 18) {
            System.out.println(name + " are you work?");
            String work = scanner.next();
            if(work.equals("yes")) {
                System.out.println("Where do you work, " + name + " ?");
                String place = scanner.nextLine();
                System.out.println(place + " nice company!");
            } else if (work.equals("no")) {
                System.out.println("Ok. Have a good job.");
            }
        }
        System.out.println(" Thank you! Have a good day! ");
    }
}

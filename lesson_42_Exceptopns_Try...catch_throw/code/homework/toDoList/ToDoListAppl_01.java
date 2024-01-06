package homework.toDoList;

import homework.toDoList.dao.ToDoListImpl_01;
import homework.toDoList.model.Menu_01;
import homework.toDoList.model.Task_01;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ToDoListAppl_01 {
    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to ToDo Application!");
        ToDoListImpl_01 toDoList = new ToDoListImpl_01(10);

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
                    System.out.println("Input task: ");
                    String task = scanner.nextLine();
                    LocalDateTime time = LocalDateTime.now();
                    int id = toDoList.quantity();
                    Task_01 newTask = new Task_01(id, task, time);
                    toDoList.addTask(newTask);
                    break;
                }
                case 2: {
                    System.out.println("Your tasks: ");
                    toDoList.viewTasks();
                    break;
                }
                case 3: {
                    System.out.println("Find");
                    System.out.println("Input task number: ");
                    int taskNumber = scanner.nextInt();
                    Task_01 foundedTask = toDoList.findTask(taskNumber);
                    System.out.println("Task found: " + foundedTask);
                    break;

                }
                case 4: {
                    System.out.println("Remove");
                    System.out.println("Input task number: ");
                    int taskNumber = scanner.nextInt();
                    Task_01 removedTask = toDoList.removeTask(taskNumber);
                    System.out.println(removedTask + " is removed.");
                    break;
                }
                case 5:
                    return;
                default: {
                    System.out.println("Wrong input.");
                }
            }
        }
    }
}

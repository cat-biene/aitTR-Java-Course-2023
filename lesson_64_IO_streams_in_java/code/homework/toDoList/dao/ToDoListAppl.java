package homework.toDoList.dao;

import homework.toDoList.model.Menu;
import homework.toDoList.model.Task;

import java.io.*;
import java.util.Scanner;
//  В приложении ToDoList сделать сохранение/чтение задач в файл
public class ToDoListAppl {
    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to ToDo Application!");
        ToDoListImpl toDoList = new ToDoListImpl();

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
                    System.out.println("Input task: ");
                    String task = scanner.nextLine();
                    Task newTask = new Task(toDoList.quantity(), task);
                    toDoList.addTask(newTask);
                    break;
                }
                case 2: {
                    System.out.println("Your tasks: ");
                    toDoList.viewTasks();
                    break;
                }
                case 3: {
                    System.out.println("Input task number: ");
                    int taskNumber = scanner.nextInt();
                    Task removedTask = toDoList.removeTask(taskNumber);
                    if(!(removedTask == null)){
                        System.out.println(removedTask + " is removed.");
                    }
                    break;
                }
                case 4:{
                    System.out.println("Saving...");
                    ToDoListImpl tasks = new ToDoListImpl();
                    try {
                        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./dest/toDoList.dat"));
                        oos.writeObject(toDoList);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
                case 5:
                  try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./dest/toDoList.dat"))) {
                      ToDoListImpl_01 readToDoList = (ToDoListImpl_01) ois.readObject();
                      System.out.println("Reading tasks...");
                      readToDoList.viewTasks();
                  } catch (IOException e) {
                      throw new RuntimeException(e);
                  } catch (ClassNotFoundException e) {
                      throw new RuntimeException(e);
                  }
                  break;

                case 6:
                    return;
                default: {
                    System.out.println("Wrong input.");
                }
            }
        }
    }
}

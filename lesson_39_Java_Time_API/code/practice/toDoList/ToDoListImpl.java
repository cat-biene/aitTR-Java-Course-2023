package practice.toDoList;

import java.util.Arrays;

// Начать реализацию приложения "Список дел".
// Использовать enum для организации меню (номер пункта, действие) приложения:
// добавить запись
// посмотреть все записи
// удалить запись (по номеру)
// выйти
// Реализовать метод printMenu().
// Реализовать класс Task (int id, String task, int taskNumber). Геттеры и сеттеры, toString, equals. Сделать класс Task сортируемым по номеру задачи.
// Интерфейс ToDoList должен соответствовать функциям меню.
// ToDoListImpl - создать, реализовать методы.
// ToDoAppl - приветствие пользователю, печать меню, запрос выбора пользователя (бесконечный цикл + switch case).
public class ToDoListImpl implements ToDoList{

    private Task[] tasks;
    private int size;

    public ToDoListImpl(int capacity) {
        tasks = new Task[capacity];
    }

    @Override
    public Boolean addTask(Task task) {
        if (task == null || size == tasks.length) {
            return false;
        }
        tasks[size++] = task;
        return true;
    }

    @Override
    public Task[] getAllTask() {
        return tasks;
    }

    @Override
    public Task[] removeTask(Task taskNumber) {
        return new Task[0];
    }

    @Override
    public Boolean exitApplication() {
        System.out.println("До свидания!");
        return true;
    }
}

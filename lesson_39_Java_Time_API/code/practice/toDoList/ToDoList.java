package practice.toDoList;
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
public interface ToDoList {

    Boolean addTask(Task task);
    Task[] getAllTask();
    Task[] removeTask(Task taskNumber);
    Boolean exitApplication();
}

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

public enum Menu {
    ADD_TASK(1, "Добавить запись"), VIEW_TASK(2, "Посмотреть все записи"), DELETE_TASK(3, "Удалить запись (по номеру)"), EXIT(4, "Выйти");

    private int numberTask;
    private String action;

    Menu(int number, String action) {
        this.numberTask = number;
        this.action = action;
    }

    public int getNumberTask() {
        return numberTask;
    }

    public String getAction() {
        return action;
    }

    public static void printMenu() {
        System.out.println("Меню: ");
        for (Menu menuTask : Menu.values()) {
            System.out.println(menuTask.getNumberTask() + ". " + menuTask.getAction());
        }
    }

}


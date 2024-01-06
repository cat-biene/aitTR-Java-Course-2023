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

public class Task implements Comparable<Task> {

    private int id;
    private String task;
    private int taskNumber;

    public Task(int id, String task, int taskNumber) {
        this.id = id;
        this.task = task;
        this.taskNumber = taskNumber;
    }

    public int getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", taskNumber=" + taskNumber +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Task task1 = (Task) object;

        if (id != task1.id) return false;
        if (taskNumber != task1.taskNumber) return false;
        return task.equals(task1.task);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + task.hashCode();
        result = 31 * result + taskNumber;
        return result;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.taskNumber, other.taskNumber);
    }
}

package homework.toDoList.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task_01 implements Comparable<Task_01>{
    // fields
    private int id; // идентификатор
    private String task; // содержание задачи
    private LocalDateTime time;

    // constructor


    public Task_01(int id, String task, LocalDateTime time) {
        this.id = id;
        this.task = task;
        this.time = time;
    }

    // геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    // метод toString
    @Override
    public String toString() {
        // TODO - должно быть сначала номер задачи, затем ее  текст
        return (id + 1) + " : " + task;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task_01 task = (Task_01) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Task_01 o) {
        // return this.taskNumber - o.getTaskNumber(); // естественная сортировка по taskNumber, от меньшего к большему
        return Integer.compare(id, o.id); // возможный вариант
    }
}

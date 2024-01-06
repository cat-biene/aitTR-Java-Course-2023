package homework.toDoList.test;

import homework.toDoList.dao.ToDoListImpl_01;
import homework.toDoList.model.Task_01;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ToDoListImplTest_01 {
    ToDoListImpl_01 toDoList;
    Task_01[] t;
    LocalDateTime timeNow = LocalDateTime.now();

    @BeforeEach
    void setUp() {
        toDoList = new ToDoListImpl_01(10);
        t = new Task_01[5];
        t[0] = new Task_01(0, "task1", timeNow);
        t[1] = new Task_01(1, "task2", timeNow);
        t[2] = new Task_01(2, "task3", timeNow);
        t[3] = new Task_01(3, "task4", timeNow);

        for (int i = 0; i < t.length; i++) {
            toDoList.addTask(t[i]);
        }
    }

    @Test
    void addTask() {
        toDoList.viewTasks();

    }

    @Test
    void removeTask() {
        toDoList.viewTasks(); // до удаления
        // удаление имеющегося элемента
        assertEquals(t[0], toDoList.removeTask(1)); // это проверка на удаление
        System.out.println("---------------------");
        toDoList.viewTasks(); // после удаления
        // проверка количества
        assertEquals(3, toDoList.quantity());
        // удаление отсутствующего элемента
        assertNull(toDoList.removeTask(6));
    }

    @Test
    void viewTasks() {

    }

    @Test
    void quantity() {

    }
}

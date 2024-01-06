package homework.toDoList.dao;

import homework.toDoList.model.Task_01;

public interface ToDoList_01 {
    // add Task
    boolean addTask(Task_01 task);
    Task_01 findTask(int taskNumber);
    // remove Task
    Task_01 removeTask(int taskNumber);
    // print list of Tasks
    void viewTasks();
    // TODO - список задач
    // quantity of tasks
    int quantity();

}

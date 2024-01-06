package homework.toDoList.dao;

import homework.toDoList.model.Task_01;

public class ToDoListImpl_01 implements ToDoList_01 {
//    private Document[] documents; // хранение документов в массиве
//    private int size; // количество документов
//
//    // constructor
//    public ArchiveImpl(int capacity) {
//        documents = new Document[capacity];
//        // this.size = 0;
//    }

    //fields
    private Task_01[] tasks;
    private int quantity;

    // constructor
    public ToDoListImpl_01(int capacity){
        tasks = new Task_01[capacity];
    }

    @Override
    public boolean addTask(Task_01 task) {
        if (task == null || quantity == tasks.length) {
            return false;
        }
        tasks[quantity] = task; //ставим в конец массива
        quantity++;
        return true;
    }

    @Override
    public Task_01 findTask(int taskNumber) {
        for (int i = 0; i < quantity; i++) {
            if (tasks[i].getId() == taskNumber - 1) {
                return tasks[i];
            }
        }
        return null;
    }

    @Override
    public Task_01 removeTask(int taskNumber) {
        for (int i = 0; i < quantity; i++) {
            if (taskNumber == tasks[i].getId() + 1) {
                Task_01 victim = tasks[i];
                System.arraycopy(tasks, i + 1, tasks, i, quantity - 1- i);
                tasks[--quantity] = null;
                return victim;
            }

        }
        return null;
    }

    @Override
    public void viewTasks() {
        for (int i = 0; i < quantity; i++) {
            System.out.println(tasks[i]);
        }
        System.out.println("You have " + quantity + " tasks.");
    }

    @Override
    public int quantity() {
        return quantity;
    }
}

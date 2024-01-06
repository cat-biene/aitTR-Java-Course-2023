package homework.toDoList.model;
//  В приложении ToDoList сделать сохранение/чтение задач в файл
public enum Menu {

    ADD(1, "Add task"),
    LIST(2, "List of tasks"),
    REMOVE(3, "Remove task"),
    SAVE(4, "Save tasks"),
    LOAD(5, "Load tasks"),
    EXIT(6, "Exit");

    //fields
    private int menuItem;
    private String action;

    // constructor
    Menu(int menuItem, String action) {
        this.menuItem = menuItem;
        this.action = action;
    }

    // метод, void - ничего не возвращает, он печатает
    public static void printMenu(){
        Menu[] menu = Menu.values(); // put enum items into array
        for (Menu menu1 : menu) {
            System.out.print(menu1.menuItem + " - " + menu1.action + " | ");
        }
        System.out.println(); // new line
    }
}

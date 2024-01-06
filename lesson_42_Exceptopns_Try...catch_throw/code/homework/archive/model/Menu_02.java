package homework.archive.model;

public enum Menu_02 {
    ADD(1, "Add document"), LIST(2, "List of documents"), QUANTITY(3, "Quantity"), FIND(4, "Find document"), REMOVE (5, "Delete document"), EXIT(6, "Exit");

    //fields
    private int menuItem;
    private String action;

    // constructor
    Menu_02(int menuItem, String action) {
        this.menuItem = menuItem;
        this.action = action;
    }

    // метод, void - ничего не возвращает, он печатает
    public static void printMenu(){
        Menu_02[] menu = Menu_02.values(); // put enum items into array
        for (int i = 0; i < menu.length; i++) {
            System.out.print((menu[i].menuItem) + " - " + menu[i].action + " | ");
        }
        System.out.println(); // new line
    }
}

package homework.book;
// Создайте класс Book с полями:
// название - title  автор - author год издания - year уникальный номер - ISBN
// В классе Book реализуйте конструктор, геттеры и сеттеры на все поля
// и метод display, который выводит информацию о книге.
// Создайте класс Dictionary, который расширяет класс Book.
// Предложите для него набор полей и переопределите метод display.
// В классе BookAppl в методе main создайте несколько словарей
// и выведите информацию о них в консоль.

import homework.book.model.Book;
import homework.book.model.Dictionary;

public class BookAppl {

    public static void main(String[] args) {

        Dictionary dictionary1 = new Dictionary(" Dictionary", "Trejsi", 2005, 565852, "language", "English", "German");
        Dictionary dictionary2 = new Dictionary(" Dictionary", "Smit", 1990, 6428, "orthographic", "English","German");
        Dictionary dictionary3 = new Dictionary(" Dictionary", "Tibor", 2022, 86247913, "language", "German", "German");

        dictionary1.display();
        dictionary1.split();
        dictionary2.display();
        dictionary2.split();
        dictionary3.display();
        dictionary3.split();
    }
}

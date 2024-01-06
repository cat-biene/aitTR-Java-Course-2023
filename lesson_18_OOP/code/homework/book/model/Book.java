package homework.book.model;
// Создайте класс Book с полями:
// название - title  автор - author год издания - year уникальный номер - ISBN
// В классе Book реализуйте конструктор, геттеры и сеттеры на все поля
// и метод display, который выводит информацию о книге.
// Создайте класс Dictionary, который расширяет класс Book.
// Предложите для него набор полей и переопределите метод display.
// В классе BookAppl в методе main создайте несколько словарей
// и выведите информацию о них в консоль.

public class Book {

    // field
    private String title;
    private String author;
    private int year;
    private int ISBN;

    // constructor
    public Book(String title, String author, int year, int ISBN) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.ISBN = ISBN;
    }

    //getter and setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    // Method display
    public void display() {
        System.out.println(" Book title : " + title + " author : " + author + " year : " + year + " ISBN : " + ISBN);
    }

    // method split
    public void split() {
        System.out.println("___________________________________________________________________");
    }
}

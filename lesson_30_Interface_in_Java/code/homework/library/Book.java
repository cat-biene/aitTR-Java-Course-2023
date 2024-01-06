package homework.library;
// создаем класс Book c полями ISBN, автор, название книги, год издания;
// создаем интерфейс Library с методами:
// добавить книгу;
// удалить книгу;
// найти книгу;
// кол-во книг;
// напечатать список книг.
// создаем класс LibraryImpl, который implements Library;
// создаем класс LibraryImplTest, в котором создаем тесты для вышеперечисленных методов.

public class Book {

    // fields
    protected int ISBN;
    protected String author;
    protected String title;
    protected int year;

    // constructor
    public Book(int ISBN, String author, String title, int year) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.year = year;
    }
    // getter and setter
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

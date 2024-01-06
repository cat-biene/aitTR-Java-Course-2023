package homework.book.model;
// Создайте класс Book с полями:
// название - title  автор - author год издания - year уникальный номер - ISBN
// В классе Book реализуйте конструктор, геттеры и сеттеры на все поля
// и метод display, который выводит информацию о книге.
// Создайте класс Dictionary, который расширяет класс Book.
// Предложите для него набор полей и переопределите метод display.
// В классе BookAppl в методе main создайте несколько словарей
// и выведите информацию о них в консоль.

public class Dictionary extends Book {

    // field
    private String type;
    private String language;
    private String country;

    // constructor
    public Dictionary(String title, String author, int year, int ISBN, String type, String language, String country) {
        super(title, author, year, ISBN);
        this.type = type;
        this.language = language;
        this.country = country;
    }

    // getter and setter

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Method displayDictionary
    public void display() {
        super.display();
        System.out.println(" type : " + type + " language : " + language + " country : " + country);
    }
}

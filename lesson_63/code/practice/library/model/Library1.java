package practice.library.model;

import java.util.ArrayList;
import java.util.List;

public class Library1 {

    private List<Book1> books;
    private List<Reader1> readers;
    private List<Review1> reviews;

    public Library1(){
        init();
    }

    private void init() {
        books = new ArrayList<>();
        // добавляем книги
        books.add(new Book1("George Orwell", "1984", 1949)); // 0
        books.add(new Book1("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", 1997)); // 1
        books.add(new Book1("J.R.R. Tolkien", "The Lord of the Rings", 1954)); // 2
        books.add(new Book1("Harper Lee", "To Kill a Mockingbird", 1960)); // 3
        books.add(new Book1("F. Scott Fitzgerald", "The Great Gatsby", 1925)); // 4
        books.add(new Book1("Leo Tolstoy", "War and Peace", 1869)); //5

        // добавляем читателей
        readers = new ArrayList<>();
        readers.add(new Reader1("Иванов Иван Иванович", "ivanov.email@test.ru", true)); // 0
        readers.add(new Reader1("Петров Петр Петрович", "petrov.email@test.ru", true)); // 1
        readers.add(new Reader1("Сидоров Сергей Сергеевич", "sidiriv.email@test.ru", true)); // 2

        // журнал выдачи книг
        readers.get(0).getBooks().add(books.get(0)); // Иванов взял книгу Джордж Оруэлл
        readers.get(1).getBooks().add(books.get(0)); // Петров взял книгу Оруэлла
        readers.get(1).getBooks().add(books.get(1)); // Петров взял книгу с индексом 1
        readers.get(1).getBooks().add(books.get(4)); // Петров взял книгу с индексом 4
        readers.get(2).getBooks().add(books.get(0)); // Сидоров взял Оруэлла
        readers.get(2).getBooks().add(books.get(2)); // Сидоров взял Tolkien

        // отзывы читателей о книгах
        reviews = new ArrayList<>();
        reviews.add(new Review1(readers.get(0),books.get(0), 5, "Very good!"));
        reviews.add(new Review1(readers.get(0),books.get(0), 4, ""));
        reviews.add(new Review1(readers.get(0),books.get(0), 4, "Bad!"));
        reviews.add(new Review1(readers.get(0),books.get(0), 4, "Awful!"));
        reviews.add(new Review1(readers.get(0),books.get(0), 4, "Brilliant!"));
        reviews.add(new Review1(readers.get(0),books.get(0), 3, "Good!"));
        reviews.add(new Review1(readers.get(0),books.get(0), 5, "Good!"));
        reviews.add(new Review1(readers.get(1),books.get(1), 3, "Excellent!")); // Петров дал отзыв нв Гарри Поттера

    }

    public List<Book1> getBooks() {
        return books;
    }

    public List<Reader1> getReaders() {
        return readers;
    }

    public List<Review1> getReviews(){
        return reviews;
    }
}

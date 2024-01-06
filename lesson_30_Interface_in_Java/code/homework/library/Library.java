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

import homework.library.Book;

public interface Library {
    // объявляем методы, только сигнатуры, без тела метода
    boolean addBook(Book book);
    Book removeBook(int ISBN);
    Book findBook(int ISBN);
    int quantity();
    void printBook();
}

package homework.library;

import homework.library.Book;

public class LibraryImpl implements Library{

    private Book[] books;// массив для хранения книг
    private int size; // текущее кол-во книг в библиотеке
    public LibraryImpl(int capacity) {
        books = new Book[capacity];

    }

    @Override
    public boolean addBook(Book book) {
        if(size == books.length || book == null || findBook(book.getISBN()) != null) {
            return false;
            }
        books[size] = book;
        size++;



        // size = 0; books {null, null, null, null, null} // l = 5
        // add(book1)
            //  books[size] = book -> books[0] = book
                // books {book1, null, null, null, null}
            // size++ -> size + 1 - > size = 1

        // add(book2)
            //  books[size] = book -> books[1] = book
                // books {book1, book2, null, null, null}
            // size++ -> size + 1 - > size = 2

        // add(book3)
            //  books[size] = book -> books[2] = book
                // books {book1, book2, book3, null, null}
            // size++ -> size + 1 - > size = 3


        return true;
    }

    @Override
    public Book removeBook(int ISBN) {
        for (int i = 0; i < size; i++) {
            if (books[i].getISBN() == ISBN) {
                Book removeBook = books[i];
                books[i] = books[size - 1];
                books[size - 1] = null;
                size--;
                return removeBook;
            }
        }
        return null;
    }

    @Override
    public Book findBook(int ISBN) {
        for (int i = 0; i < size; i++) {
            if (books[i].getISBN() == ISBN) {
                return books[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printBook() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
}

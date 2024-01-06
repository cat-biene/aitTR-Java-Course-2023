package practice.book_02;

import practice.book_02.model.Book_02;

public class BookAppl_02 {

    public static void main(String[] args) {
        Book_02 book0 = new Book_02(2000000000000l, "Book0", 1988);
        Book_02 book1 = new Book_02(3000000000000l, "Book1", "Author1", 1998);
        Book_02 book2 = new Book_02(4000000000000l, "Book2", "Author1", 1995);
        Book_02 book3 = new Book_02(5000000000000l, "Book3", "Author2", 1990);
        Book_02 book4 = new Book_02(6000000000000l, "Book4", 1981);
        book0.display();
        book1.display();
        book2.display();
        book3.display();
        book4.display();
    }
}

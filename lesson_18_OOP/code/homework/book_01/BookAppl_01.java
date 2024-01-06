package homework.book_01;

import homework.book_01.model.Book_01;
import homework.book_01.model.Dictionary_01;

public class BookAppl_01 {

    public static void main(String[] args) {

        Book_01 book = new Book_01("War and peace", "Tolstoy", 1980, 1000L);
        book.display();
        System.out.println("----------------------------------------");
        Dictionary_01 dictionaryEng = new Dictionary_01("English Dictionary", "Bonk", 1985, 2000L, "english", 20000, "language");
        dictionaryEng.display();
        System.out.println("----------------------------------------");
        Dictionary_01 dictionaryWords = new Dictionary_01("Words Dictionary", "Ojegov", 1990, 3000L, "russian", 30000, "words");
        dictionaryWords.display();
        System.out.println("----------------------------------------");

    }
}

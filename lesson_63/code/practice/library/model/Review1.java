package practice.library.model;

import java.time.LocalDate;

public class Review1 {

    private long id;
    private int rating;
    private Reader1 reader;
    private String comment;
    private Book1 book;
    private int likes;
    private LocalDate date;

    public Review1(Reader1 reader, Book1 book, int rating, String comment ) {
        this.reader = reader;
        this.book = book;
        this.rating = rating;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public Reader1 getReader() {
        return reader;
    }

    public String getComment() {
        return comment;
    }

    public Book1 getBook() {
        return book;
    }

    public int getLikes() {
        return likes;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Review{" + " book=" + book + " rating = " + rating + ", reviewer = " + reader + ", comment = '" + comment + ", likes = " + likes + '}';
    }

}

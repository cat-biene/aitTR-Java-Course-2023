package practice.review_01.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Review_01 implements Comparable<Review_01>{

    // fields of class
    private long id;
    private int rating;
    private String author;
    private String comment;
    private String product;
    private int likes;
    public LocalDateTime date;

    // constructor
    public Review_01(int rating, String author, String comment, String product) {
        this.rating = rating;
        this.author = author;
        this.comment = comment;
        this.product = product;
    }

    // getter
    public long getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public String getAuthor() {
        return author;
    }

    public String getComment() {
        return comment;
    }

    public String getProduct() {
        return product;
    }

    public int getLikes() {
        return likes;
    }

    public LocalDateTime getDate() {
        return date;
    }

    // setter
    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    // method toString
    @Override
    public String toString() {
        return "Review_01{" +
                "rating=" + rating +
                ", author='" + author + '\'' +
                ", comment='" + comment + '\'' +
                ", product='" + product + '\'' +
                ", likes=" + likes +
                '}';
    }



    // methods equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review_01 review01 = (Review_01) o;
        return id == review01.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int addLike() {
        likes++;
        return likes;
    }

    @Override
    public int compareTo(Review_01 o) {
        return this.date.compareTo(o.date);
    }

}

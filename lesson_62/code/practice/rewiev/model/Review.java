package practice.rewiev.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Review implements Comparable<Review> {



    // fields of class
    private long id;
    private int rating;
    private String author;
    private String product;
    private String comment;
    private int likes;
    public LocalDateTime date;

    // constructor
    public Review(int rating, String author, String product, String comment, int likes) {
        this.rating = rating;
        this.author = author;
        this.product = product;
        this.comment = comment;
        this.likes = likes;
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
        return "Review{" +
                ", rating=" + rating +
                ", author='" + author + '\'' +
                ", product='" + product + '\'' +
                ", likes=" + likes +
                '}';
    }

    // methods equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return id == review.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int addLike() {
        return likes;
    }

    @Override
    public int compareTo(Review o) {
        return o.date.compareTo(this.date);
    }

    public int compareToRating(Review o) {
        return o.rating-(this.rating);
    }

}

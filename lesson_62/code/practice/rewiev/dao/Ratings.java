package practice.rewiev.dao;

import practice.rewiev.model.Review;

public interface Ratings {

    boolean add(Review review);
    boolean remove(Long id);
    boolean update(Long id, int newRating);
    Iterable<Review> getReviewsByProduct(String product);
    Iterable<Review> getReviewsByAuthor(String author);
    double getAvgRatingByProduct(String product);
    Iterable<Review> getReviewWithMaxLikes();
}

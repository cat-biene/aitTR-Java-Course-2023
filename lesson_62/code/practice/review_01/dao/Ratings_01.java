package practice.review_01.dao;

import practice.review_01.model.Review_01;

public interface Ratings_01 {

    boolean add(Review_01 review);
    boolean remove(Long id);
    boolean update(Long id, int newRating);
    Iterable<Review_01> getReviewsByProduct(String product);
    Iterable<Review_01> getReviewsByAuthor(String author);
    double getAvgRatingByProduct(String product);
    Iterable<Review_01> getReviewWithMaxLikes();
}

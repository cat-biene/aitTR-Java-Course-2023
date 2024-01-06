package practice.review_01.dao;

import practice.review_01.model.Review_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Ratings_01Impl implements Ratings_01{

    // fields
    Collection<Review_01> review_01s;

    // constructor
    public Ratings_01Impl() {
        this.review_01s = new ArrayList<>();
    }

    @Override
    public boolean add(Review_01 review) {
        return review_01s.add(review);
    }

    @Override
    public boolean remove(Long id) {
        return review_01s.removeIf(review_01 -> review_01.getId() == id);
    }

    @Override
    public boolean update(Long id, int newRating) {
        for (Review_01 review : review_01s) {
            if (review.getId() == id) {
                review.setRating(newRating);
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterable<Review_01> getReviewsByProduct(String product) {
        return review_01s.stream()
                .filter(review -> review.getProduct().equals(product))
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Review_01> getReviewsByAuthor(String author) {
        return review_01s.stream()
                .filter(review -> review.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    @Override
    public double getAvgRatingByProduct(String product) {
        return review_01s.stream()
                .filter(review -> review.getProduct().equals(product))
                .mapToInt(Review_01::getRating)
                .average()
                .orElse(0.0);
    }

    @Override
    public Iterable<Review_01> getReviewWithMaxLikes() {
        int max = review_01s.stream()
                .mapToInt(Review_01::getLikes)
                .max()
                .orElse(0);

        return review_01s.stream()
                .filter(review -> review.getLikes() == max)
                .collect(Collectors.toList());
    }
}

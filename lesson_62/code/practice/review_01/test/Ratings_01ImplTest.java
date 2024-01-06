package practice.review_01.test;

import org.junit.jupiter.api.Test;
import practice.review_01.dao.Ratings_01;
import practice.review_01.dao.Ratings_01Impl;
import practice.review_01.model.Review_01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ratings_01ImplTest {

    @Test
    void testAddReview() {
        Ratings_01 ratings = new Ratings_01Impl();
        Review_01 review = new Review_01(5, "A1", "C", "P");

        assertTrue(ratings.add(review));
    }

    @Test
    void testRemoveReview() {
        Ratings_01 ratings = new Ratings_01Impl();
        Review_01 review = new Review_01(4, "A2", "C2", "P2");
        ratings.add(review);

        assertTrue(ratings.remove(review.getId()));
    }

    @Test
    void testUpdateReview() {
        Ratings_01 ratings = new Ratings_01Impl();
        Review_01 review = new Review_01(3, "A3", "C3", "P3");
        ratings.add(review);

        assertTrue(ratings.update(review.getId(), 4));
        assertEquals(4, review.getRating());
    }

    @Test
    void testGetAvgRatingByProduct() {
        Ratings_01 ratings = new Ratings_01Impl();
        Review_01 review1 = new Review_01(5, "A4", "C4", "P4");
        Review_01 review2 = new Review_01(4, "A5", "C5", "P4");
        ratings.add(review1);
        ratings.add(review2);

        assertEquals(4.5, ratings.getAvgRatingByProduct("P4"));
    }

    @Test
    void testGetReviewWithMaxLikes() {
        Ratings_01 ratings = new Ratings_01Impl();
        Review_01 review1 = new Review_01(4, "A6", "C6", "P6");
        Review_01 review2 = new Review_01(5, "A7", "C7", "P7");
        review2.addLike(); // Increment likes for review2
        ratings.add(review1);
        ratings.add(review2);

        assertEquals(1, ratings.getReviewWithMaxLikes().spliterator().getExactSizeIfKnown());
        assertEquals(review2, ratings.getReviewWithMaxLikes().iterator().next());
    }
}
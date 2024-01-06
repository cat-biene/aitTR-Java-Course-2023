package practice.review_01;

import practice.review_01.dao.Ratings_01;
import practice.review_01.dao.Ratings_01Impl;
import practice.review_01.model.Review_01;

import java.util.*;

public class Retings_02Appl {
    public static void main(String[] args) {
        Ratings_01 ratings = new Ratings_01Impl();

        generateReviews(ratings, 10);

        // Получаем и выводим список продуктов, отсортированный по рейтингу
        List<String> productsSortedByRating = getProductsSortedByRating(ratings);
        System.out.println("Список продуктов, отсортированный по рейтингу:");
        productsSortedByRating.forEach(System.out::println);

        System.out.println();

        // Получаем и выводим список продуктов, отсортированный по количеству отзывов
        List<String> productsSortedByReviewCount = getProductsSortedByReviewCount(ratings);
        System.out.println("Список продуктов, отсортированный по количеству отзывов:");
        productsSortedByReviewCount.forEach(System.out::println);

        System.out.println();

        // Получаем и выводим список авторов, отсортированный по количеству лайков
        List<String> authorsSortedByLikes = getAuthorsSortedByLikes(ratings);
        System.out.println("Список авторов, отсортированный по количеству лайков:");
        authorsSortedByLikes.forEach(System.out::println);
    }

    private static void generateReviews(Ratings_01 ratings, int numberOfReviews) {
        Random random = new Random();
        List<String> products = List.of("Product A", "Product B", "Product C", "Product D");
        List<String> authors = List.of("Author1", "Author2", "Author3", "Author4", "Author5");

        for (int i = 0; i < numberOfReviews; i++) {
            String product = getRandomElement(products, random);
            String author = getRandomElement(authors, random);
            int rating = random.nextInt(5) + 1; // Рейтинг от 1 до 5
            int likes = random.nextInt(41) + 10; // Количество лайков от 10 до 50

            Review_01 review = new Review_01(rating, author, "Random comment", product);
            review.setComment(String.valueOf(likes));

            ratings.add(review);
        }
    }

    private static List<String> getProductsSortedByRating(Ratings_01 ratings) {
        List<String> products = new ArrayList<>();
        ratings.getReviewsByProduct("").forEach(review -> products.add(review.getProduct()));
        return sortByRating(products, ratings);
    }

    private static List<String> sortByRating(List<String> products, Ratings_01 ratings) {
        Collections.sort(products, Comparator.comparingDouble(product ->
                ratings.getAvgRatingByProduct(product)));
        Collections.reverse(products);
        return products;
    }

    private static List<String> getProductsSortedByReviewCount(Ratings_01 ratings) {
        List<String> products = new ArrayList<>();
        ratings.getReviewsByProduct("").forEach(review -> products.add(review.getProduct()));
        Collections.sort(products, Comparator.comparingInt(product ->
                (int) ratings.getReviewsByProduct(product).spliterator().getExactSizeIfKnown()));
        Collections.reverse(products);
        return products;
    }

    private static List<String> getAuthorsSortedByLikes(Ratings_01 ratings) {
        List<String> authors = new ArrayList<>();
        ratings.getReviewWithMaxLikes().forEach(review -> authors.add(review.getAuthor()));
        return sortByLikes(authors, ratings);
    }

    private static List<String> sortByLikes(List<String> authors, Ratings_01 ratings) {
        /*Collections.sort(authors, Comparator.comparingInt(author ->
                ratings.getReviewWithMaxLikes().stream()
                        .filter(review -> review.getAuthor().equals(author))
                        .mapToInt(Review_01::getLikes)
                        .sum()));
        Collections.reverse(authors);*/
        return authors;
    }

    private static <T> T getRandomElement(List<T> list, Random random) {
        return list.get(random.nextInt(list.size()));
    }
}

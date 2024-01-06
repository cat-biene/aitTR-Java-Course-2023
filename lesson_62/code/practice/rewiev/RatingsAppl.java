package practice.rewiev;

import practice.rewiev.dao.Ratings;
import practice.rewiev.dao.RatingsImpl;
import practice.rewiev.model.Review;

import java.util.*;
import java.util.stream.Collectors;

public class RatingsAppl {
    public static void main(String[] args) {

        // Создайте приложение, в котором задайте несколько отзывов (порядка 10) на несколько продуктов (3-4 продукта).
        //Каждый автор может оставить только один отзыв на каждый продукт. Отзывы получили случайное число лайков
        //от посетителей сайта в интервале от 10 до 50.
        //Рассчитайте рейтинг продуктов на основании оценок в отзывах на эти продукты.
        //
        //Получите также:
        //- список продуктов, отсортированный по их рейтингу;
        //- список продуктов, отсортированный по количеству отзывов на них;
        //- список авторов, отсортированный по количеству лайков под их отзывами.
        Ratings ratings = new RatingsImpl();
        Random random = new Random();
        Collection<Review> reviews = new ArrayList<>();

        reviews.add(new Review(1, "autnor1", "product1", "comment3", random.nextInt(10, 51)));
        reviews.add(new Review(2, "autnor2", "product1", "comment3", random.nextInt(10, 51)));
        reviews.add(new Review(4, "autnor3", "product2", "comment5", random.nextInt(10, 51)));
        reviews.add(new Review(5, "autnor4", "product1", "comment4", random.nextInt(10, 51)));
        reviews.add(new Review(5, "autnor5", "product2", "comment4", random.nextInt(10, 51)));
        reviews.add(new Review(5, "autnor6", "product3", "comment5", random.nextInt(10, 51)));
        reviews.add(new Review(4, "autnor7", "product2", "comment0", random.nextInt(10, 51)));
        reviews.add(new Review(2, "autnor8", "product3", "comment0", random.nextInt(10, 51)));
        reviews.add(new Review(2, "autnor9", "product1", "comment1", random.nextInt(10, 51)));
        reviews.add(new Review(1, "autnor10", "product1", "comment1", random.nextInt(10, 51)));

        System.out.println("==================List Starts===================");
        reviews.forEach(System.out::println);

        System.out.println("===================List Sorted By Rating==================");
        /*reviews.stream()
                .sorted(Review::compareToRating)
                .forEach(System.out::println);*/

        System.out.println("==================Sorted By Rating===================");
        List<String> products = List.of("product1", "product2", "product3");
        Map<String, Double> productRatings = new HashMap<>();
        for (String product : products) {
            double rating = calculateProductRating((List<Review>) reviews, Collections.singletonList(product));
            productRatings.put(product, rating);
        }

        // Sort the products based on ratings
        List<String> sortedProducts = new ArrayList<>(productRatings.keySet());
        Collections.sort(sortedProducts, Comparator.comparingDouble(productRatings::get));

        // Print the sorted product ratings
        for (String product : sortedProducts) {
            System.out.println("Product " + product + " rating: " + productRatings.get(product));
        }


        // Сортировка списка продуктов по количеству комментариев
        Map<String, Long> productCommentCounts = reviews.stream()
                .collect(Collectors.groupingBy(Review::getProduct, Collectors.counting()));

        List<String> sortedProductsByComments = productCommentCounts.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("=============Products  by comment count===========:");
        sortedProductsByComments
                .forEach(product -> System.out.println(product + " - " + productCommentCounts.get(product)));

        // Сортировка списка авторов по количеству лайков под их отзывами
        Map<String, Integer> authorLikeCounts = reviews.stream()
                .collect(Collectors.groupingBy(Review::getAuthor, Collectors.summingInt(Review::getLikes)));

        List<String> sortedAuthorsByLikes = authorLikeCounts.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("===========Authors  by  likes================");
        sortedAuthorsByLikes.forEach(author -> System.out.println(author + " - " + authorLikeCounts.get(author)));



    }
    public static double calculateProductRating(List<Review> reviews, List<String> products) {
        double totalRating = 0;
        int reviewCount = 0;
        for (Review review : reviews) {
            if (products.contains(review.getProduct())) {
                totalRating += review.getRating();
                reviewCount++;
            }
        }
        return reviewCount > 0 ? totalRating / reviewCount : 0;
    }
}

package practice.review_01;
// Создайте приложение, в котором задайте несколько отзывов (порядка 10) на несколько продуктов (3-4 продукта).
//Каждый автор может оставить только один отзыв на каждый продукт. Отзывы получили случайное число лайков
//от посетителей сайта в интервале от 10 до 50.
//Рассчитайте рейтинг продуктов на основании оценок в отзывах на эти продукты.
//
//Получите также:
//- список продуктов, отсортированный по их рейтингу;
//- список продуктов, отсортированный по количеству отзывов на них;
//- список авторов, отсортированный по количеству лайков под их отзывами.

public class Ratings_01Appl {

    /*public static void main(String[] args) {
        // Создаем объект для хранения отзывов
        Ratings_01 ratings = new Ratings_01Impl();

        // заполняем список отзовов
        List<Review_01> review = getReview();

        // Генерируем отзывы и добавляем их в хранилище
        generateReviews(ratings, 10);

        // Получаем список продуктов, отсортированный по рейтингу
        List<String> productsSortedByRating = getProductsSortedByRating(ratings);
        System.out.println("List of products sorted by rating:");
        productsSortedByRating.forEach(System.out::println);

        System.out.println();

        // Получаем список продуктов, отсортированный по количеству отзывов
        List<String> productsSortedByReviewCount = getProductsSortedByReviewCount(ratings);
        System.out.println("List by products sorted by comment:");
        productsSortedByReviewCount.forEach(System.out::println);

        System.out.println();

        // Получаем список авторов, отсортированный по количеству лайков
        List<String> authorsSortedByLikes = getAuthorsSortedByLikes(ratings);
        System.out.println("list of products sorted by Likes:");
        authorsSortedByLikes.forEach(System.out::println);
    }

    private static List<Review_01> getReview() {
        return List.of(
                new Review_01(1, "autnor1", "product1", "comment3"),
        new Review_01(2, "autnor2", "product1", "comment3"),
        new Review_01(4, "autnor3", "product2", "comment5"),
        new Review_01(5, "autnor4", "product1", "comment4"),
        new Review_01(5, "autnor5", "product2", "comment4"),
        new Review_01(5, "autnor6", "product3", "comment5"),
        new Review_01(4, "autnor7", "product2", "comment0"),
        new Review_01(2, "autnor8", "product3", "comment0"),
        new Review_01(2, "autnor9", "product1", "comment1"),
        new Review_01(1, "autnor10", "product1", "comment1")

        );
    }

    private static void generateReviews(Ratings_01 ratings, int numberOfReviews) {
        Random random = new Random();

        // Список продуктов
        List<String> products = List.of("Product A", "Product B", "Product C", "Product D");

        // Список авторов
        List<String> authors = List.of("Author1", "Author2", "Author3", "Author4", "Author5");

        for (int i = 0; i < numberOfReviews; i++) {
            String product = products.get(random.nextInt(products.size()));
            String author = authors.get(random.nextInt(authors.size()));
            int rating = random.nextInt(5) + 1; // Рейтинг от 1 до 5
            int likes = random.nextInt(41) + 10; // Количество лайков от 10 до 50

            // Создаем отзыв
            Review_01 review = new Review_01(rating, author, "Random comment", product);
            review.setComment(String.valueOf(likes));

            // Добавляем отзыв в хранилище
            ratings.add(review);
        }
    }

   private static List<String> getProductsSortedByRating(Ratings_01 rating) {
        return ratings.getReviewsByProduct("").stream()
                .collect(Collectors.groupingBy(Review_01::getProduct, Collectors.averagingDouble(Review_01::getRating)))
                //.entrySet().stream()
                .sorted(Collections.reverseOrder(Comparator.comparingDouble(Entry::getValue)))
                .map(Entry::getKey)
                .collect(Collectors.toList());
    }

    private static List<String> getProductsSortedByReviewCount(Ratings_01 ratings) {
        return ratings.getReviewsByProduct("").stream()
                .collect(Collectors.groupingBy(Review_01::getProduct, Collectors.counting()))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Comparator.comparingLong(Entry::getValue)))
                .map(Entry::getKey)
                .collect(Collectors.toList());
    }

    private static List<String> getAuthorsSortedByLikes(Ratings_01 ratings) {
        return ratings.getReviewWithMaxLikes().stream()
                .collect(Collectors.groupingBy(Review_01::getAuthor, Collectors.summingInt(Review_01::getLikes)))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Comparator.comparingInt(Entry::getValue)))
                .map(Entry::getKey)
                .collect(Collectors.toList());
    }*/
}

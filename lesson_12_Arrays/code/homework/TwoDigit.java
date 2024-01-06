package homework;
// Найти произведение двузначных нечетных чисел кратных 17
public class TwoDigit {
    public static void main(String[] args) {
        int product = 1;

        for (int i = 17; i <= 99; i += 17) {
            if (i % 2 != 0) {
                product *= i;
            }
        }

        System.out.println("Произведение двузначных нечетных чисел, кратных 17: " + product);
    }
}

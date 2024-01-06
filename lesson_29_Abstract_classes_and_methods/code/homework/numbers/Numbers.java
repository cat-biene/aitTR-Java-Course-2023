package homework.numbers;
// Задан массив целых чисел {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2}.
// Найдите среднюю величину по всем четным элементам массива.
// Разработайте соответсвующий тест (набор тестов).


public class Numbers {

    public double averageNumbers(int[] numbers) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
                count++;
            }
        }
        if (count > 0) {
            return (double) sum / count;
        } else {
            return 0;
        }
    }
}


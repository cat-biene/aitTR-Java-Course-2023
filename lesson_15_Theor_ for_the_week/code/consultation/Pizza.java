package consultation;
//  Цель задачи: Найти и вывести имя друга, который съел больше всех кусков пиццы.
// * <p>
// * <p>
// * У вас есть массив из 6 элементов, каждый из которых представляет количество кусков пиццы, съеденных 6 друзьями. Выведите имя друга, который съел больше всех.
// * <p>
// * <p>
// * Создайте массив, который будет содержать количество кусков пиццы, съеденных каждым из 6 друзей. пример: {2, 4, 3, 5, 1, 3}
// * Создайте массива с именами друзей: пример: {"Алекс", "Борис", "Вера", "Галя", "Дима", "Елена"}
// * Найдите максимально значение в первом массиве и запомните индекс этого значения. В нашем примере максимально е значение 5, под индексом 3
// * Найдите друга во втором массиве, который съел больше всех кусков пиццы. В нашем примере это - Галя
public class Pizza {

    public static void main(String[] args) {
        int[] pizzas = {2, 4, 3, 5, 10, 3};
        String[] friends = {"Алекс", "Борис", "Вера", "Галя", "Дима", "Елена"};

        int indexOfMaxElement = findIndexOfMaxElement(pizzas);

        System.out.println(friends[indexOfMaxElement] + " съел(а) больше всего кусков пиццы, " + pizzas[indexOfMaxElement]);
    }

    public static int findIndexOfMaxElement(int[] array) {
        int maxElementIndex = 0;
        int max = array[maxElementIndex];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxElementIndex = i;
            }
        }

        return maxElementIndex;
    }
}

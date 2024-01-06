package consultation;

public class ArrayTask3 {

    // DATA: {1, 5, 1, 3, 5, 98}
    // Output
    // 1 - 2
    // 5 - 2
    // 1 - 2
    // 3 - 1
    // 5 - 2
    // 98 - 1


    public static void main(String[] args) {
        int[] source = {-100, 1, 5, 1, 3, 5, 98, 1, 100, -100}; // длина массива -> 6
        int arrLength = source.length; // 6

//        int lastElementInArray = source[arrLength - 1];

        for (int i = 0; i < arrLength; i++) {
            int currentValue = source[i]; // i = 0, currentValue = 1 | i = 1, currentValue = 5
            int counter = 0;

            for (int j = 0; j < arrLength; j++) {
                if (currentValue == source[j]) {
                    counter++;
//                    counter = counter + 1;
                }
            }

            System.out.println("Число " + currentValue + " ,повторяется " + counter + " раз(а)");
        }
    }
}

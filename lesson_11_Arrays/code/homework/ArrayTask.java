package homework;
// подсчитать сколько раз каждое число встречаеться в массиве и вывести результат в консоль
public class ArrayTask {

// {1, 5, 1, 3, 5}


    public static void main(String[] args) {
        int[] source = {1, 5, 1, 3, 5};
        int arrLength = source.length;

        for (int i = 0; i < arrLength; i++) {
            int currentValue = source[i];
            int counter = 0;

            for (int j = 0; j < arrLength; j++) {
                if(currentValue == source[j]) {
                    counter++;
                }

            }
            System.out.println("Число " + currentValue + ", повторяеться " + counter + " раз(а) ");


        }
    }
    }


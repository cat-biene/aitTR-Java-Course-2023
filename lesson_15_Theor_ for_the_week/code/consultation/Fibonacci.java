package consultation;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 50;
        long[] source = new long[n];
        generate(source);
        System.out.println();
    }

    public static void generate(long[] array) {
        array[0] = 0;
        array[1] = 1;
//        array[2] = array[0] + array[1]; // 0 + 1 = 1
//        array[3] = array[1] + array[2]; // 1 + 1 = 2
//        array[4] = array[2] + array[3]; // 1 + 2 = 3
//        array[5] = array[3] + array[4]; // 2 + 3 = 5

        for (int index = 2; index < array.length; index++) {
            array[index] = array[index - 1] + array[index - 2];
        }
    }
}

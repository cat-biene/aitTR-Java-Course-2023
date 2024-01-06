package practice;
// Возведите 3 в степень 10, выведите все промежуточные результаты.

public class Power3 {

    public static void main(String[] args) {

        int count = 1;
        int result = 1;

        while (count <= 10) {
            result = 3 * result; // возведение в степень
            System.out.println(result + " 3 in power " + count);
            count++;
        }

    }

}

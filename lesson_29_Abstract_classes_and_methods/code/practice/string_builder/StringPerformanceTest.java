package practice.string_builder;

public class StringPerformanceTest {

    public static final int N_ITERATION = 100_000; // определяем константы
    private static final String WORD = "Word"; // определяем константы

    public static void main(String[] args) {

        //String - immutable
        String str = ""; // инициировали пустую строку
        long t1 = System.currentTimeMillis();// засекаем время
        for (int i = 0; i < N_ITERATION; i++) {
            str = str + WORD;
        }
        long t2 = System.currentTimeMillis(); // вторая засечка времени
        System.out.println(t2 - t1); // сколько времени прошло в миллисекундах

        //StringBuilder - mutable
        StringBuilder stringBuilder = new StringBuilder("");
        t1 = System.currentTimeMillis();// засекаем время
        for (int i = 0; i < N_ITERATION; i++) {
            stringBuilder.append(WORD);
        }
        str = stringBuilder.toString();
        t2 = System.currentTimeMillis(); // вторая засечка времени
        System.out.println(t2 - t1); // сколько времени прошло в миллисекундах
    }
}

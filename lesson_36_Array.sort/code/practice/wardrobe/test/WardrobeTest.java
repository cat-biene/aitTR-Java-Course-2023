package practice.wardrobe.test;

import practice.wardrobe.model.Wardrobe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

class WardrobeTest {

    private static final int SIZE = 10;
    private static final int MAX = 6;
    private static final int MIN = 1;

    static Random random = new Random();

    Wardrobe[] wardrobe;

    @BeforeEach
    void setUp() {

        wardrobe = new Wardrobe[SIZE];
        for (int i = 0; i < wardrobe.length; i++) {
            double height = random.nextInt(MIN, MAX);
            double width = random.nextInt(MIN, MAX);
            double depth = random.nextInt(MIN, MAX);

            wardrobe[i] = new Wardrobe(height, width, depth);
        }
    }

    private void printArray(Object[] arr, String titel) {
        System.out.println("=====" + titel + "=====");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    void testNatureOrderWardrobe() {
        printArray(wardrobe,"Test Comparable before sort");
        Arrays.sort(wardrobe);
        printArray(wardrobe, "Test Comparable after sort");
        int index = Arrays.binarySearch(wardrobe, new Wardrobe(2, 4, 1));
        System.out.println("index = " + index);
    }

    @Test
    void testAreaComparator() {
        printArray(wardrobe, "Test Area Comparator before sort");
        Comparator<Wardrobe>comparator = (w1, w2) -> Double.compare(w1.area(), w2.area());
        Arrays.sort(wardrobe, comparator);
        printArray(wardrobe, "Test Area Comparator after sort");
        int index = Arrays.binarySearch(wardrobe, new Wardrobe(2, 4, 1), comparator);
        System.out.println("index = " + index);
    }

    @Test
    void testVolumeComparator() {
        printArray(wardrobe, "Test Volume Comparator before sort");
        Comparator<Wardrobe>comparator = (w1, w2) -> Double.compare(w1.volume(), w2.volume());
        Arrays.sort(wardrobe, comparator);
        printArray(wardrobe, "Test Volume Comparator after sort");
        int index = Arrays.binarySearch(wardrobe, new Wardrobe(2, 4, 1), comparator);
        System.out.println("index = " + index);
    }

    @Test
    void testHeightVolumeComparator() {
        printArray(wardrobe, "Test Area Comparator before sort");
        Comparator<Wardrobe>comparator = (w1, w2) -> {
            int res = w1.compareTo(w2);
            // int res = Double.compare(w1.getHeight(), w2.getHeight());
            return res != 0 ? res : Double.compare(w1.volume(), w2.volume());
        };
        Arrays.sort(wardrobe, comparator);
        printArray(wardrobe, "Test Area Comparator after sort");
        int index = Arrays.binarySearch(wardrobe, new Wardrobe(2, 4, 1), comparator);
        System.out.println("index = " + index);
    }
}

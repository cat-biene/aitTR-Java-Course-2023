package practice.arrays.test;

import practice.arrays.utils.ArrayTools;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

class ArrayToolsTest1 {
    Integer[] arrNum;
    String[] arrStr;
    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{9, 7, 4, 7, 2, 5, 1, 0};
        arrStr =new String[]{"one", "two", "three", "four", "five"};
    }
    @Test
    void printArray() {
        System.out.println("=====test Print Arrat=====");
        ArrayTools.printArray(arrNum);
        ArrayTools.printArray(arrStr);
    }

    @Test
    void testSearch() {
        System.out.println("======Test Search=====");
        int index = ArrayTools.search(arrStr, "four");
        System.out.println("index = " + index);
        index = ArrayTools.search(arrStr, "six");
        System.out.println("index = " + index);
        index = ArrayTools.search(arrNum, 4);
        System.out.println("index = " + index);
        index = ArrayTools.search(arrNum, 6);
        System.out.println("index = " + index);
    }

    @Test
    void testFindByPredicate() {
        System.out.println("=====Test Find By Predicate");
        Predicate <Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 5;
            }
        };
        Integer num = ArrayTools.findByPredicate(arrNum, n -> n < 5);
        System.out.println(num);
        num = ArrayTools.findByPredicate(arrNum, n -> n % 5 == 0);
        System.out.println(num);
    }

    @Test
    void testBubbleSort() {
        System.out.println("=====Test Bubble Sort=====");
        ArrayTools.bubbleSort(arrNum);
        ArrayTools.printArray(arrNum);
        ArrayTools.bubbleSort(arrStr);
        ArrayTools.printArray(arrStr);

    }

    @Test
    void testBubbleSortComparator() {
        System.out.println("=====Test Bubble Sort=====");
        ArrayTools.bubbleSort(arrNum, (n1,n2) -> n2 -n1);
        ArrayTools.printArray(arrNum);
        ArrayTools.bubbleSort(arrStr, (s1,s2) -> s1.length() - s2.length());
        ArrayTools.printArray(arrStr);

    }

    @Test
    void testBinarySearch() {
        System.out.println("=====Test Binary Search=====");
        ArrayTools.printArray(arrNum);
        System.out.println();
        ArrayTools.bubbleSort(arrNum);
        ArrayTools.binarySearchComparable(arrNum,5);
        ArrayTools.printArray(arrNum);
        System.out.println();

        /*ArrayTools.binarySearchComparator(arrNum, 5, comparator);
        ArrayTools.printArray(arrNum);*/

    }
}
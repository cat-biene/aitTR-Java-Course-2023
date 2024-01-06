package homework;
// Имеется список студентов с фамилиями, необходимо их распределить на 2 группы случайным образом

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Students {

    // There is a list of students with last names, they need to be divided into 2 groups randomly.

    public static void main(String[] args) {

        String[] students = {"Ivanov", "Petrov", "Sidorov", "Smith", "London", "Kristi"};

        // Create arrays for two groups
        String[] group1 = new String[students.length / 2];
        String[] group2 = new String[students.length - group1.length];

        Random random = new Random();
        for (int i = 0; i < students.length; i++) {
            // Assign each student to a random group
            int randomGroup = random.nextInt(2);
            if (randomGroup == 0) {
                group1[i % group1.length] = students[i];
            } else {
                group2[i % group2.length] = students[i];
            }
        }

        // Display the groups
        System.out.println("Group 1: " + Arrays.toString(group1));
        System.out.println("Group 2: " + Arrays.toString(group2));
    }
}


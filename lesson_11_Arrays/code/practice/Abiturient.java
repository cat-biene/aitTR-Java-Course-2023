package practice;
// Имеются оценки абитуриента из его аттестата, всего 20 оценок.
// Найдите средний балл абитуриента.

public class Abiturient {

    public static void main(String[] args) {

        int[] marks = {2, 3, 3, 1, 4, 1, 3, 2, 1, 1, 3, 2};

        int sumOfMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            // sumOfMarks = sumOfMarks + marks[i]; // длино но понятно
            sumOfMarks += marks[i]; // короткая запись

        }

        double averageMarks = (double) sumOfMarks / marks.length;
        System.out.printf(" Average marks: %.2f", averageMarks);

    }

}

package homework;
//  Напечатайте на экране шахматную доску размером 8х8.
//  0 - белая клеточка, 1 - черная.
//  Левая верхняя клеточка должна быть 0, левая нижняя - 1.

public class Chess {

    public static void main(String[] args) {

        int size = 8; // board size

        for (int a = 0; a < size; a++) { // the row
            for (int b = 0; b < size; b++) { //  the column
                int res = (a + b) % 2 == 0 ? 0 : 1; // усли сумма индексов строки и столбца - четная (белая - 0), не четная ( черная - 1)
                System.out.print(res + " ");

            }

            System.out.println();
        }

    }

}

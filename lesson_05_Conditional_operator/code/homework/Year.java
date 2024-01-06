package homework;
// Написать программу, определяющую, является ли год високосным.
// Для того чтобы год был високосным, он должен: делится без остатка на 4 и,
// либо не должен делится без остатка на 100,
// либо если он делится на 100, то он должен делится также на 400.
// Проверить на годах 1700, 1800, 1900 - не високосные, а 2000 високосный.

public class Year {

    public static void main(String[] args) {

        int years1 = 1700;
        int years2 = 1800;
        int years3 = 1900;
        int years4 = 2000;


        if(years1 % 4 == 0 && years1 % 100 == 0 && years1 % 400 == 0) {
            System.out.println( years1 + " is leap year! ");
        } else {
            System.out.println(years1 + " is not leap year! ");
        }

        if(years2 % 4 == 0 && years2 % 100 == 0 && years2 % 400 == 0) {
            System.out.println(years2 + " is leap year! ");
        } else {
            System.out.println(years2 + " is not leap year! ");
        }

        if(years3 % 4 == 0 && years3 % 100 == 0 && years3 % 400 == 0) {
            System.out.println(years3 + " is leap year! ");
        } else {
            System.out.println(years3 + " is not leap year! ");
        }

        if(years4 % 4 == 0 && years4 % 100 == 0 && years4 % 400 == 0) {
            System.out.println(years4 + " is leap year! ");
        } else {
            System.out.println(years4 + " is not leap year! ");
        }


    }

}

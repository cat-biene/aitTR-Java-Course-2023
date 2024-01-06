package practice;

public class Conditions {

    public static void main(String[] args) {

        int x = -100;

        if(x > 0) {
            System.out.println(" x - положительное");

        } else if(x == 0) {
            System.out.println(" x = 0 ");

        } else {
            System.out.println(" x - отрицательное");
        }

        int y = 11;

        if(y % 2 == 0){
            System.out.println(" Число: " + y +  " - четное ");
        } else {
            System.out.println(" Число: " + y + " - не четное ");
        }

        int age = 18;
        if(age >= 18) {
            System.out.println("Вам разрешенно действовать самостоятельно");
        } else {
            System.out.println("Вам надо прийти с вашим опекуном");
        }

    }

}

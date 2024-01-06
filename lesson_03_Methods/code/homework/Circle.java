package homework;

public class Circle {

    public static void main(String[] args){

        // area of a circle S = pi * r * r
        double constanta = pi();
        printPi(constanta);
        double res = circleArea(50);
        System.out.println("S = " + res);
    }

    public static double circleArea(double radius) {
        double S = pi() * radius * radius;
        return S;
    }

    public static void printPi(double p) {
        System.out.println("Pi = " + p);
    }

    public static double pi() {
       double pi = 3.1415926;
       return pi;
    }
}


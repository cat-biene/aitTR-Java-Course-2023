package practice.recurcion;

public class SquareRoot {

    public static void main(String[] args) {

        double root = sqrt(64);
        System.out.println(root);
    }

    private static double sqrt(int n) {
        return sqrtRecursive(n, n / 2);
    }

    private static double sqrtRecursive(double n, double gess) {
        double newGess = (gess + n / gess) / 2; // new gess
        System.out.println(newGess);
        if(Math.abs(newGess - gess) < 0.0001){
          return newGess;
        }

        return sqrtRecursive(n, newGess);
    }
}

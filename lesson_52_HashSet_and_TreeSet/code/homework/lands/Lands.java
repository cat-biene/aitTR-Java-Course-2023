package homework.lands;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lands {

    //  Write a program that:
    //
    //reads from the keyboard the number of entered names of lands in Germany,
    //reads the names of lands from the keyboard and collects them into a set,
    //displays the results on the screen.

    private static final String[] GERMAN_LANDS = {"Baden-Wurttemberg", "Bavaria", "Berlin", "Brandenburg", "Bremen", "Hamburg", "Hesse", "Lower Saxony", "Mecklenburg-Vorpommern", "North Rhine-Westphalia", "Rhineland-Palatinate", "Saarland", "Saxony", "Saxony-Anhalt", "Schleswig-Holstein", "Thuringia"};

    public static void main(String[] args) {

        Set<String> lands = new HashSet<>();
        int count = 0;
        do {
            System.out.println("Welcome!");
            System.out.println("Input the name of a German land to add to the list: ");

            Scanner scanner = new Scanner(System.in);
            String land = scanner.nextLine();

            if(!isValidGermanyLands(land)) {
                System.out.println("Invalid German land. Please enter a valid German land name.");
                continue;
            }

            if (lands.add(land)) {
                count++;
                System.out.println(land + " added to the list, " + "number " + count);
            } else {
                System.out.println(land + "already exists of list, " + "number " + count);
            }

            System.out.println("Continue?  Press V to stop.");
            String chair = scanner.nextLine();
            if (chair.equalsIgnoreCase("v")) {
                break;
            }
        } while (true);
        System.out.println("Lands in Germany: ");
        System.out.println(lands);
        System.out.println("Quantity lands in the list: " + count);
    }

    private static boolean isValidGermanyLands(String land) {
        for (String lan : GERMAN_LANDS) {
            if(lan.equalsIgnoreCase(land)) {
                return true;
            }
        }
        return false;
    }
}

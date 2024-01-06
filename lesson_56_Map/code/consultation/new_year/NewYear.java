package consultation.new_year;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NewYear {

    public static void main(String[] args) {
        int boxes = new Random().nextInt((50 + 1 - 20) + 20) ;
        List<Boxes> boxesList = IntStream.range(0, boxes).mapToObj(x -> new Boxes()).collect(Collectors.toList());

        System.out.println("Count of sweets in boxes: " + countTotalSweets(boxesList));
        System.out.println("Count of packages: " + countTotalPackages(boxesList));
        System.out.println("Count of min sweets in package: " + minSweetsPackages(boxesList));
    }

    public static int minSweetsPackages(List<Boxes> boxesList) {
        int min = boxesList.get(0).min();
        for (Boxes boxes : boxesList) {
            if(boxes.min() < min) {
                min = boxes.min();
            }
            if(boxes.min() == 0) {
                System.out.println();
            }
        }
        return min;
    }

    public static long countTotalPackages (List<Boxes> boxesList) {
        long result = 0;
        for (Boxes boxes : boxesList) {
            result += boxes.packages.size();
        }
        return result;

    }

    public static long countTotalSweets (List<Boxes> boxesList) {
        long result = 0;
        for (Boxes boxes : boxesList) {
            result += boxes.sum();
        }
        return result;
    }
}

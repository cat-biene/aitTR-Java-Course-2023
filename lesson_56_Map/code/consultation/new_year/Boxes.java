package consultation.new_year;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Boxes {
    List<Packages> packages = new ArrayList<>();

    public Boxes() {
        Random random = new Random();
        int min = 5;
        int max = 10;
        int rndNum = random.nextInt((max + 1 - min) + min);
        for (int i = 0; i < rndNum; i++) {
            packages.add(new Packages());
        }
    }

    public int min() {

        return packages.stream()
                .mapToInt(x -> x.sweets.size())
                .min().orElse(0);
       /* int result = packages.get(0).sweets.size();
        for (Packages pack : packages) {
            if(pack.sweets.size() < result) {
                result = pack.sweets.size();
            }
        }
        return result;*/
    }

    public int max() {
        int result = 0;
        for (Packages pack : packages) {
            if(pack.sweets.size() > result) {
                result = pack.sweets.size();
            }
        }
        // return result;
        return packages.stream()
                .mapToInt(x -> x.sweets.size())
                .max().orElse(0);
    }

    public int sum() {
        return packages.stream()
                .map(x -> x.sweets.size())
                .reduce(0, (a, b) -> a + b);
    }
}

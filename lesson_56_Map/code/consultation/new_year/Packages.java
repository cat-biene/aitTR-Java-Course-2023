package consultation.new_year;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Packages {

    List<Sweets> sweets = new ArrayList<>();

    public Packages() {
        Random random = new Random();
        int min = 10;
        int max = 50;
        int rndNum = random.nextInt((max + 1 - min) + min);
        for (int i = 0; i < rndNum; i++) {
            sweets.add(new Sweets());
        }
    }

}

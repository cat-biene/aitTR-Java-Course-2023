package homework.yacht;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class YachtManager {

    private List<Yacht> yachts;

    public YachtManager() {
        init();
    }

    private void init() {
        yachts = new ArrayList<>();
        // adds yachts
        yachts.add(new Yacht("Manufacturer1", LocalDate.of(2000, 5, 13),32.5, "Metal", 150000));
        yachts.add(new Yacht("Manufacturer2", LocalDate.of(2020, 5, 02),30.5, "Metal", 250000));
        yachts.add(new Yacht("Manufacturer3", LocalDate.of(2022, 12, 10),31, "Metal", 320000));
        yachts.add(new Yacht("Manufacturer4", LocalDate.of(2015, 4, 15),40.2, "Wood", 180000));
        yachts.add(new Yacht("Manufacturer5", LocalDate.of(2002, 2, 12),35.5, "Wood", 160000));
        yachts.add(new Yacht("Manufacturer6", LocalDate.of(2022, 5, 19),30, "Wood", 150000));
        yachts.add(new Yacht("Manufacturer7", LocalDate.of(2000, 6, 10),29.5, "Plastic", 110000));
        yachts.add(new Yacht("Manufacturer8", LocalDate.of(2018, 3, 13),32.5, "Metal", 210000));
        yachts.add(new Yacht("Manufacturer9", LocalDate.of(2000, 5, 10),25, "Plastic", 80000));
        yachts.add(new Yacht("Manufacturer10", LocalDate.of(2012, 5, 03),33.5, "Plastic", 120000));

    }

    public List<Yacht> getYachts() {
        return yachts;
    }
}

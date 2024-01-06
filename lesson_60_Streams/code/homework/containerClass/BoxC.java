package homework.containerClass;

import java.util.Iterator;
import java.util.List;

public class BoxC implements Iterable<ParcelC>{

       List<ParcelC> parcels;

   /* public BoxC(int numParcels) {
        Random random = new Random();
        this.parcels = Stream.generate(() -> new Parcel(random.nextDouble(0,2))) // Parcel weight between 1 and 2 kg
                .limit(numParcels)
                .collect(Collectors.toList());
    }

        public int quantity() {
            return parcels.size();
        }

        @Override
        public String toString() {
            return "\nBox have " + parcels;
        }*/


    @Override
    public Iterator<ParcelC> iterator() {
        return parcels.iterator();
    }
}

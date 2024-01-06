package homework.containerClass;

import java.util.Iterator;
import java.util.List;

public class ContainerC implements Iterable<BoxC> {
    String label;
    List<BoxC> boxes;

    /*public ContainerC(String label, int numBoxes) {
        this.label = label;
        Random random = new Random();
        this.boxes = IntStream.range(0, numBoxes)
                .mapToObj(i -> new BoxC(random.nextInt(5, 11)))
                .collect(Collectors.toList());
    }

    public int getTotalParcels() {
        return boxes.stream()
                .mapToInt(box -> box.parcels.size())
                .sum();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<BoxC> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<BoxC> boxes) {
        this.boxes = boxes;
    }

    @Override
    public String toString() {
        return "Container{ " +
                "label=' " + label + '\'' +
                ", boxes= " + boxes;
    }*/

    @Override
    public Iterator<BoxC> iterator() {
        return boxes.iterator();
    }
}
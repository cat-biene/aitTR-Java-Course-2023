package homework.containerClass;

public class ShipmentCAppl {

   /* private static final int MIN_CONTAINERS = 10;
    private static final int MAX_CONTAINERS = 20;
    private static final int MIN_BOXES = 10;
    private static final int MAX_BOXES = 20;
    private static final int MIN_PARCELS = 5;
    private static final int MAX_PARCELS = 10;

    private static Random random = new Random();

    public static void main(String[] args) {

        List<ContainerC> containerList = new ArrayList<>();
        int conRandom = new Random().nextInt(MIN_CONTAINERS, MAX_CONTAINERS);
        for (int i = 0; i < conRandom; i++) {

            List<BoxC> boxList = new ArrayList<>();
            int boxRandom = new Random().nextInt(MIN_BOXES, MAX_BOXES);
            for (int j = 0; j < boxRandom; j++) {

                List<ParcelC> parcelList = new ArrayList<>();
                int parcelRandom = new Random().nextInt(MIN_PARCELS, MAX_PARCELS);
                for (int k = 0; k < parcelRandom; k++) {
                    parcelList.add(new ParcelC(2));
                }
                boxList.add(new BoxC(parcelList));
            }
            containerList.add(new ContainerC(boxList));
        }



    }
    //-------Container-----------------------------------------


    //--------Box----------------------------------------


    //---------- Parcel ----------------------------------------*/
   /*public static void main(String[] args) {
       Random random = new Random();
       int numContainers = random.nextInt(10, 21); // От 10 до 20 контейнеров


       List<ContainerC> containers = Stream.generate(() ->
                       new ContainerC("Wakanda", random.nextInt(10, 21)))
               .limit(numContainers)
               .collect(Collectors.toList());

       List<Integer> contNumbers = IntStream.rangeClosed(1, numContainers)
               .boxed()
               .collect(Collectors.toList());

       IntStream.range(0, numContainers).forEach(index -> {
           ContainerC container = containers.get(index);
           System.out.println("Container " + contNumbers.get(index) + " : " + container.label);
           container.boxes.forEach(box -> {
               System.out.println("  Box with " + box.parcels.size() + " parcels");
               box.parcels.forEach(parcel ->
                       System.out.println("    Parcel with weight: " + parcel.weight + " kg"));
           });
           System.out.println();
       });

       int totalParcels = containers.stream()
               .mapToInt(ContainerC::getTotalParcels)
               .sum();

       double totalWeight = containers.stream()
               .flatMap(container -> container.boxes.stream())
               .flatMap(box -> box.parcels.stream())
               .mapToDouble(parcel -> parcel.weight)
               .sum();

       System.out.println("Total parcels: " + totalParcels);
       System.out.println("Total weight: " + totalWeight + " kg");

       int maxParcels = containers.stream()
               .mapToInt(ContainerC::getTotalParcels)
               .max()
               .orElse(0);
       System.out.println("Max parcel in Container = " + maxParcels);
       System.out.println();
       System.out.println("Containers with the maximum number of parcels:");
       containers.stream()
               .filter(container -> container.getTotalParcels() == maxParcels)
               .forEach(System.out::println);

   }*/
}

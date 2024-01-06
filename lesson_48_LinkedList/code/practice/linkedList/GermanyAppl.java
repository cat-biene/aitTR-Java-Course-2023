package practice.linkedList;

//  In the GermanyAppl (main) class,
//  create a LinkedList containing cities
//  - the capitals of the German states.
//  Try on it the methods that are available for the LinkedList class.
//  Add Hamburg to the middle of the list, to the top of the list.
public class GermanyAppl {

    public static void main(String[] args) {

        NodeListImpl<String> city = new NodeListImpl<>();
        city.isEmpty();

        city.add("Berlin");
        city.add("Stuttgart");
        city.add("Munich");
        city.add("Potsdam");
        city.add("Bremen");
        city.add("Wiesbaden");
        city.add("Schwerin");
        city.add("Hanover");
        city.add("Mainz");
        city.add("Dusseldorf");
        city.add("Saarbrucken");
        city.add("Dresden");
        city.add("Magdeburg");
        city.add("Kiel");
        city.add("Erfurt");
        city.add(0, "Hamburg");
        city.add(10, "Hamburg");
        city.clear();







    }
}

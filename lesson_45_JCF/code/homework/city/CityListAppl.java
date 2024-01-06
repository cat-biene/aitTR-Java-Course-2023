package homework.city;

import homework.city.CityList;
import homework.city.CityListImpl;
import practice.iList.IListImpl;

public class CityListAppl {

    public static void main(String[] args) {

        // список с целыми числами
        CityList<String> cityList = new CityListImpl<>();
        System.out.println("Quantity in list: " + cityList.size());
        System.out.println("The list is empty: " + cityList.isEmpty());
        System.out.println("***     ***     ***     ***     ***");


        cityList.add("Berlin");
        cityList.add("Munich");
        cityList.add("Stuttgart");
        cityList.add("Hanover");

        for (String s : cityList) {
            System.out.println(s);
        }

        for (int i = 0; i < cityList.size(); i++) {
            System.out.println(cityList.get(i));

        }
        /*cityList.printCityList();
        System.out.println("Quantity in list: " + cityList.size());
        System.out.println("The list is empty: " + cityList.isEmpty());
        System.out.println("***     ***     1     ***     ***");
        System.out.println("Added an element to the list: " + cityList.add("Bremen"));
        cityList.printCityList();
        System.out.println("Quantity in list: " + cityList.size());
        System.out.println("The list is empty: " + cityList.isEmpty());
        System.out.println("***     ***     2    ***     ***");
        System.out.println("Element by index: " + cityList.contains("Munich"));
        System.out.println("***     ***     3     ***     ***");
        System.out.println("Removed element by index: " + cityList.remove(1));
        cityList.printCityList();
        System.out.println("Quantity in list: " + cityList.size());
        System.out.println("***     ***     4     ***     ***");
        System.out.println("Added element by index: " + cityList.add(1,"Dresden"));
        cityList.printCityList();
        System.out.println("Quantity in list: " + cityList.size());
        System.out.println("***     ***     5     ***     ***");
        System.out.println("Removed an element from the list: " + cityList.remove(1));
        cityList.printCityList();
        System.out.println("Quantity in list: " + cityList.size());
        System.out.println("***     ***     6     ***     ***");
        System.out.println("Get element by index: " + cityList.get(1));
        cityList.printCityList();
        System.out.println("***     ***     7     ***     ***");
        System.out.println("Update an element in a list by index: " + cityList.set(2, "Hamburg"));
        cityList.printCityList();
        System.out.println("***     ***     8     ***     ***");
        System.out.println("Knowing an element find its index: " + cityList.indexOf("Berlin"));
        System.out.println("***     ***     9     ***     ***");
        System.out.println("Knowing the element look for the index from the end: " + cityList.lastIndexOf("Bremen"));
        System.out.println("***     ***     10     ***     ***");
        cityList.clean();
        System.out.println("Quantity in list: " + cityList.size());
        System.out.println("The list is empty: " + cityList.isEmpty());
*/
    }
}

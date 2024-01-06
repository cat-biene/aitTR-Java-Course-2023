package practice.iList;

public class IListAppl {

    public static void main(String[] args) {

        // список с целыми числами
        IList1<Integer> list = new IListImpl<>();
        System.out.println("Quantity in list: " + list.size());
        System.out.println("The list is empty: " + list.isEmpty());
        System.out.println("***     ***     ***     ***     ***");


        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Quantity in list: " + list.size());
        System.out.println("The list is empty: " + list.isEmpty());
        System.out.println("***     ***     ***     ***     ***");
        System.out.println("Added an element to the list: " + list.add(50));
        System.out.println("Quantity in list: " + list.size());
        System.out.println("The list is empty: " + list.isEmpty());
        System.out.println("***     ***     ***     ***     ***");
        System.out.println("Element by index: " + list.contains(1));
        System.out.println("***     ***     ***     ***     ***");
        System.out.println("Removed element by index: " + list.remove(1));
        System.out.println("Quantity in list: " + list.size());
        System.out.println("***     ***     ***     ***     ***");
        System.out.println("Added element by index: " + list.add(1,50));
        System.out.println("Quantity in list: " + list.size());
        System.out.println("***     ***     ***     ***     ***");
        System.out.println("Removed an element from the list: " + list.remove(1));
        System.out.println("Quantity in list: " + list.size());
        System.out.println("***     ***     ***     ***     ***");
        System.out.println("Get element by index: " + list.get(1));
        System.out.println("***     ***     ***     ***     ***");
        System.out.println("Update an element in a list by index: " + list.set(2, 60));
        System.out.println("***     ***     ***     ***     ***");
        System.out.println("Knowing an element find its index: " + list.indexOf(30));
        System.out.println("***     ***     ***     ***     ***");
        System.out.println("Knowing the element look for the index from the end: " + list.lastIndexOf(50));
        System.out.println("***     ***     ***     ***     ***");
        list.clean();
        System.out.println("Quantity in list: " + list.size());
        System.out.println("The list is empty: " + list.isEmpty());
    }
}

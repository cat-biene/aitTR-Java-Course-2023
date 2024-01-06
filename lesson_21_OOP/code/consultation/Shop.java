package consultation;

/**
 * @author Andrej Reutow
 * created on 05.10.2023
 */
public class Shop {

    public static void main(String[] args) {
        Product pen1 = new Pen(1, 0.99, "MK1", "Green");
        Product pen2 = new Pen(2, 0.99, "MK2", "Green");
        Pen pen3 = new Pen(3, 0.99, "MK2", "Black");

        Product meat1 = new Meat(4, 17.99, "WB", "Pig");
        Product meat2 = new Meat(5, 9.59, "Ja", "Beef");

        Product[] products = new Product[5];
        products[0] = pen1;
        products[1] = pen2;
        products[2] = pen3;
        products[3] = meat1;
        products[4] = meat2;

        for (int i = 0; i < products.length; i++) {
            Object currentObj = products[i];
            System.out.println(currentObj.getClass());

            if (currentObj instanceof Product) {
                Product castedObj = (Product) currentObj;
                castedObj.cost();
            }

            if (currentObj instanceof Pen) {
                Pen castedObj = (Pen) currentObj;
                System.out.println(castedObj.getColor());
            }

            if (currentObj instanceof Meat) {
                Meat castedObj = (Meat) currentObj;
                System.out.println(castedObj.getType());
            }
        }
    }
}

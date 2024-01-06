package homework.shop;

import homework.shop.Display;
import homework.shop.Laptop;
import homework.shop.Product;

public class ShopAppl {
    public static void main(String[] args) {

        Product[] products = {
                new Laptop(1,"HP", 2500),
                new Laptop(2,"Lenovo", 2499),
                new Display(3, "Dell", 900),
                new Display(4, "Samsung", 300),

        };

        for (int i = 0; i < products.length; i++) {
            System.out.println("#".repeat(60));
            Product currentProduct = products[i];
            currentProduct.getProductInfo();
            currentProduct.buyOnline();
            currentProduct.buyOffline();
        }
    }
}

package practice.supermarket.model;

import practice.supermarket.model.Product_02;

public class Supermarket {

    private Product_02[] products;
    private int quantity;

    public Supermarket(int capacity) {
        products = new Product_02[capacity];
    }

    public boolean addProduct(Product_02 product) {
        if (product == null || quantity == products.length || findProduct(product.getBarcode()) != null) {
            return false;
        }
        products[quantity] = product;
        quantity++;
        return true;
    }

    public Product_02 findProduct(long barcode) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode) {
                return products[i];
            }
        }
        return null;
    }

    public Product_02 updateProduct(long barcode, double price) {
        // TODO update product price
        // найти продукт в массиве по его баркоду и обновить ему цену
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode) {
                products[i].setPrice(price);
                return products[i];
            }
        }
        return null;
    }

    public boolean removeProduct(long barCode) {
        // TODO remove product
        // найти продукт в массиве по его баркоду и удалить элемент массива:
        // пусть удаляемый продукт стоит на i-м индексе, тогда можно поставить на его место последний элемент массива,
        // затем последний элемент присвоить null, длину массива уменьшить на 1.
        for (int i = 0; i < products.length; i++) { // начинаем цикл, пробегаем по массиву
            if (products[i] != null && products[i].getBarcode() == barCode) { // продукт не null и сравниваем barCode
                products[i] = products[quantity - 1]; // последний элемент массива ставим на место удаляемого
                products[quantity - 1] = null; // обнуляем последний элемент
                quantity--; // уменьшаем кол-во элементов в массиве
                return true;
            }
        }
        return false;
    }

    public void printAllProducts() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i]);
            }
        }
    }

    public int getQuantity() {
        return quantity;
    }
}

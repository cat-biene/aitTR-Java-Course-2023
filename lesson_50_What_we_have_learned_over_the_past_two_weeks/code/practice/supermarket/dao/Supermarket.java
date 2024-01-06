package practice.supermarket.dao;

import practice.supermarket.model.Product_01;


public interface Supermarket extends Iterable<Product_01>{

    boolean addProduct(Product_01 product);
    Product_01 removeProduct(long barCode);
    Product_01 findByBarCode(long barCode);
    Iterable<Product_01> findByCategory(String category);
    Iterable<Product_01> findByBrand(String brand);
    Iterable<Product_01> findProductsWithExpiredDate();
    int skuQuantity(); // количество складских единиц, 1 продукт = 1 sku

}

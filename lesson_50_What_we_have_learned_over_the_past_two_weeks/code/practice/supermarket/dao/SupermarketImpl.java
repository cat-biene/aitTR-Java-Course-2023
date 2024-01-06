package practice.supermarket.dao;

import practice.supermarket.model.Product_01;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class SupermarketImpl implements Supermarket{

    private Collection<Product_01> products = new ArrayList<>();

    @Override
    public boolean addProduct(Product_01 product) {
        if(product == null || products.contains(product)) { // проверяет на содержание
            return false;
        }
        return products.add(product);
    }

    @Override
    public Product_01 removeProduct(long barCode) {
        Product_01 removed = findByBarCode(barCode); // нашли продукт по barCode, удалили из списка
        products.remove(removed);
        return removed; // вернули из метода, который удалили
    }

    @Override
    public Product_01 findByBarCode(long barCode) {
        for (Product_01 product : products) {
            if(product.getBarCode() == barCode) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Iterable<Product_01> findByCategory(String category) {
        return findByPredicate(p -> category.equalsIgnoreCase(p.getCategory()));
    }

    @Override
    public Iterable<Product_01> findByBrand(String brand) {
        return findByPredicate(p -> brand.equalsIgnoreCase(p.getBrand()));
    }

    @Override
    public Iterable<Product_01> findProductsWithExpiredDate() {
        LocalDate currentDay = LocalDate.now();
        return findByPredicate(p -> currentDay.isAfter(p.getExpDate()));
    }

    private Iterable<Product_01> findByPredicate(Predicate<Product_01> predicate) {
        List<Product_01> res = new ArrayList<>();
        // перебираем весь список продуктов, находим те. которые удовлитворяют условию продукта
        for (Product_01 product : products) {
            if(predicate.test(product)) {
                res.add(product);
            }
        }
        return res;
    }

    @Override
    public int skuQuantity() {
        return products.size();
    }

    @Override
    public Iterator<Product_01> iterator() {
        return products.iterator(); // берем iterator от ArrayList
    }
}

package project.group_02.сalorie.dao;

import project.group_02.сalorie.model.CalorieEntry;
import project.group_02.сalorie.model.Product;

import java.time.LocalDateTime;
import java.util.List;

public interface Calorie {
    void addEntry(LocalDateTime dateTime, List<Product> products);

    List<CalorieEntry> getEntries();

    List<Product> readProductsFromCSV();

    void saveFood(List<Product> products);

    List<Product> loadFood();

    void addProduct(List<Product> libraryFood, List<Product> userProducts, String food, int gram, LocalDateTime dateTime);

    boolean removeProduct (String product);
}

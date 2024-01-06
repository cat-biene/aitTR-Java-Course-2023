package practice.family_budget.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.family_budget.dao.BudgetImpl;
import practice.family_budget.model.Product;
import practice.family_budget.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BudgetImplTest {

    List<Purchase> purchaseList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    List<Product> productList1 = new ArrayList<>();
    List<Product> productList2 = new ArrayList<>();
    BudgetImpl budget = new BudgetImpl(purchaseList,0);

    @BeforeEach
    void setUp() {
        productList = List.of(
                new Product("milk", 1.0, 2),
                new Product("wine", 3.0, 1),
                new Product("bread", 1.5, 3),
                new Product("chocolate", 0.5, 2),
                new Product("salt", 1, 1)
        );

        productList1 = List.of(
                new Product("bread", 1.5, 3),
                new Product("chocolate", 0.5, 2),
                new Product("salt", 1, 1)
        );

        productList2 = List.of(
                new Product("milk", 1.0, 2),
                new Product("wine", 3.0, 1),
                new Product("bread", 1.5, 3)
        );

        purchaseList = List.of(
          new Purchase(1, LocalDate.of(2023,12,01), 1,"Lidl", "mom", productList),
          new Purchase(2, LocalDate.of(2023,12,02), 1, "Lidl", "mom", productList1),
          new Purchase(3, LocalDate.of(2023,12,03), 1, "Lidl", "mom", productList),
          new Purchase(4, LocalDate.of(2023,12,04), 1, "Lidl", "mom", productList2)
        );
        for (Purchase purchase : purchaseList) {
            budget.addPurchase(purchase);
        }
        double b = budget.calcBudget();
        System.out.println(b);

    }

    @Test
    void addPurchase() {
      //assertFalse(budget.addPurchase(null));
      assertFalse(budget.addPurchase(purchaseList.get(0)));
      Purchase p = new Purchase(5, LocalDate.of(2023,12,05),1, "Lidl", "mom", productList2);
      assertTrue(budget.addPurchase(p));
      double b = budget.calcBudget();
      System.out.println(b);

    }

    @Test
    void calcBudget() {
        assertEquals(39, budget.calcBudget());
    }

    @Test
    void budgetByPerson() {

    }

    @Test
    void budgetByStore() {
        assertEquals(10, "Lidl");
    }

    @Test
    void budgetByPeriod() {
    }

    @Test
    void addMoney() {
    }

    @Test
    void checkBudget() {
    }

    @Test
    void checkMoney() {
    }
}
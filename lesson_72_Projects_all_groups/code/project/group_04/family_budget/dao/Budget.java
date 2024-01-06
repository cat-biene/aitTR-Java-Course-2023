package project.group_04.family_budget.dao;

import project.group_04.family_budget.model.Purchase;

import java.time.LocalDate;
import java.util.List;

public interface Budget {
    boolean addPurchase(Purchase purchase);
    double calcBudget();
    double budgetGetPerson(String person);
    List<Purchase> sortByPerson(String person);
    double budgetByStore(String store);
    List<Purchase> sortByStore(String store);
    double budgetByPeriod(LocalDate from, LocalDate to);
    List<Purchase> sortByPeriod(LocalDate from, LocalDate to);
    double checkBudget();
    Purchase removePurchase(int id);
    void print();
}

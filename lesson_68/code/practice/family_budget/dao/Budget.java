package practice.family_budget.dao;

import practice.family_budget.model.Purchase;

import java.time.LocalDate;

public interface Budget {

    boolean addPurchase(Purchase purchase);
    double calcBudget();
    double budgetByPerson(String person);
    double budgetByStore(String store);
    double budgetByPeriod(LocalDate from, LocalDate to);
    double addMoney (double money);
    boolean checkBudget(Purchase purchase);
    double checkMoney(Purchase purchase);

    void printBudget();
}

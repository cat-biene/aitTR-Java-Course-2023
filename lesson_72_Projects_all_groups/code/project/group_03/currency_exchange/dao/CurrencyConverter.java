package project.group_03.currency_exchange.dao;

import project.group_03.currency_exchange.model.Currency;

import java.util.List;

public interface CurrencyConverter {
    List<Currency> readCurrenciesFromFile(String filePath);

    void buyCurrency(String currencyCode, double amount);

    void sellCurrency(String currencyCode, double amount);

    void saveTransactionsToFile(List<Currency> currencies, String filePath);
}

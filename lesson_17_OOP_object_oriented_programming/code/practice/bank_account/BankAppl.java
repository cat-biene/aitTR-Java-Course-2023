package practice.bank_account;

import practice.bank_account.model.BankAccount;

public class BankAppl {

    public static void main(String[] args) {

        BankAccount acc0 = new BankAccount(100L, "Bill Smit","Banket", 1, 100);
        acc0.displa();
        System.out.println(acc0.getOwner());
        System.out.println(acc0.getBalance());
        acc0.deposit(500);
        System.out.println(acc0.getBalance());
        acc0.withdrow(350);
        System.out.println(acc0.getBalance());
        acc0.withdrow(300);
        System.out.println(acc0.getBalance());

        BankAccount acc1 = new BankAccount(200L, "Banket", 1);
        System.out.println(acc1.getOwner());
    }
}
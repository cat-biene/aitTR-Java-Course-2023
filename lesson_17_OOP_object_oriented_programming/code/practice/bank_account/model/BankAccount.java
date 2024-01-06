package practice.bank_account.model;

public class BankAccount {
    // поля класса
    private long id;
    private String owner;
    private String bankName;
    private int branch;
    private double balance;

    // конструктор(ы) класса

    public BankAccount(long id, String owner, String bankName, int branch, double balance) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
    }

    //конструктор безполя баланс
    public BankAccount(long id, String owner, String bankName, int branch) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
        balance = 0.0;
    }

    // клиент без имени
    public BankAccount(long id, String bankName, int branch, double balance) {
        this.id = id;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
        owner = "Anonimus";
    }
    // клиент без имени и денег
    public BankAccount(long id, String bankName, int branch) {
        this.id = id;
        this.bankName = bankName;
        this.branch = branch;
        owner = "Anonimus";
        balance = 0.0;
    }

    public void displa() {
        System.out.println("acc: " + id + ", owner: " + owner + ", bank: " + bankName + ", balance: " + balance);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // положить деньги на счет
    public boolean deposit(double sum) {
        balance = balance + sum;
        return true;
    }

    // снять деньги на счет
    public boolean withdrow(double sum){
        if (sum <= balance) {
            balance = balance - sum;
            return true;
        }
       return false;
    }
}

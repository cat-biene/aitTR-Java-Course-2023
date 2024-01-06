package homework;
// Бизнесмен взял ссуду m тысяч рублей в банке под 10% годовых. Через сколько лет его долг превысит s тысяч рублей, если за это время он не будет отдавать долг.
public class Businessman {
    public static void main(String[] args) {
        double loanAmount = 100; // сумма ссуды в тысячах рублей
        double annualInterestRate = 10; // годовая процентная ставка
        double targetDebt = 200; // целевая сумма долга в тысячах рублей

        int years = 0;
        double currentDebt = loanAmount;

        while (currentDebt <= targetDebt) {
            double interest = currentDebt * (annualInterestRate / 100);
            currentDebt += interest;
            years++;
        }

        System.out.println("Через " + years + " лет долг превысит " + targetDebt + " тысяч рублей.");
    }
}

package consultation;

public class Currency {
    // Реализовать метод, который принимает на вход сумму денег в евро, а возвращает ее значение в долларах. Значение курса задать внутри программы.

    public static void main(String[] args) {
        double euro = 10;
        double dollar = convertCurrency(euro);
        System.out.println(euro + " euro = " + dollar + " dollar ");

    }

    public static double convertCurrency(double euro) {
        double exchangeRate = 1.09; //  1 euro = 1.09 dollars
        double dollar =  euro * exchangeRate;
        return dollar;
    }

}

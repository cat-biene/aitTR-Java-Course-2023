package homework;

public class Store {
    // Сделайте расчет покупки товаров со скидками.
    // Товар А стоит X евро и на него скидка D%,
    // а товар B стоит Y евро и на него скидка С%.
    // Клиент взял N товаров A и M товаров B.
    // Если сумма покупки превысила 100 евро,
    // то полагается дополнительная скидка 5%.
    // Вычислите итоговую стоимость покупки и величину полученной скидки.

    public static void main(String[] args) {

        double productA = 10; // цена товара А
        double productB = 10; // цена товара В
        double discontD = 10; // скидка на товар А в процентах
        double discontC = 10; // скидка на товар B в процентах

        int quantityA = 10;// количество товаров А
        int quantityB = 10; //количество товаров В

        double subTotA = subTotalA(productA, discontD);
        double subTotB = subTotalB(productB, discontC);
        double disSumD = discontSumD(productA, quantityA, discontD);
        double disSumC = discontSumC(productB, quantityB,discontC);

        double totCost = totalCost(subTotA, disSumD, subTotB, disSumC);
        double addDiscount = additionalDiscoun(totCost);

        if (totCost > 100) {
            totCost -= addDiscount;
            System.out.println("Итоговая стоимость покупки: " + totCost + " евро");
            System.out.println("Полученная скидка: " + (disSumD + disSumC) + " евро");

        }

    }

    public static double subTotalA(double a, double d) {
        double subTotA = a * d; // стоимость товара А без учета скидки
        return subTotA;

    }
    public static double subTotalB(double y, double c) {
        double subTotB = y * c; // стоимость товара B без учета скидки
        return subTotB;

    }

    public static double discontSumD(double a, double n, double d) {
        double disSumD = a * n * d / 100; // расчет суммы скидки для товара А
        return disSumD;
    }

    public static double discontSumC(double y, double n1, double c) {
        double disSumC = y * n1 * c / 100; // расчет суммы скидки для товара В
        return disSumC;

    }

    public static double totalCost(double A, double D, double B, double C) {
        double totCost = A * D + B * C; // стоимость товара со скидкой
        return totCost;

    }

    public static double additionalDiscoun(double z) {
        double totCost = (z * 5) / 100; // если сумма превышет 100 евро
        return totCost;
    }

}

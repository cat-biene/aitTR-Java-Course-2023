package homework.equation;
// Создать клас EquationAppl в пакете equation с методом main.
// В методе main создать несколько экземпляров QuadraticEquation
// и вывести для каждого из них результаты работы методов display, delta, quantityRoots.

import homework.equation.model.QuadraticEquation;

public class EquationAppl {

    public static void main(String[] args) {

        QuadraticEquation empl1 = new QuadraticEquation(5,8,2);
        QuadraticEquation empl2 = new QuadraticEquation(3,5,7);
        QuadraticEquation empl3 = new QuadraticEquation(9,5,1);

        empl1.display();
        empl2.display();
        empl3.display();

        empl1.delta();
        System.out.println("Delta for empl1: " + empl1.delta());
        empl2.delta();
        System.out.println("Delta for empl2: " + empl2.delta());
        empl3.delta();
        System.out.println("Delta for empl3: " + empl3.delta());

        empl1.quantityRoots();
        System.out.println("Quantity of Roots for empl1: " + empl1.quantityRoots());
        empl2.quantityRoots();
        System.out.println("Quantity of Roots for empl2: " + empl2.quantityRoots());
        empl3.quantityRoots();
        System.out.println("Quantity of Roots for empl3: " + empl3.quantityRoots());


    }
}

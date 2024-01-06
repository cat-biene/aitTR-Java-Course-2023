package practice.company;

import practice.company.model.Employee_03;
import practice.company.model.Manager_03;
import practice.company.model.SalesManager_03;
import practice.company.model.Worker_03;

public class EmployeeAppl {
    public static void main(String[] args) {

        Employee_03[] empl = new Employee_03[4];
        empl[0] = new Manager_03(100, "John", "Smith", 45, 160, 5000, 5);
        empl[1] = new SalesManager_03(101,"Anna", "Black", 36, 160, 25000, 0.1);
        empl[2] = new SalesManager_03(102,"Thomas", "White", 28, 160, 30000, 0.1);
        empl[3] = new Worker_03(103, "Gans", "Bauer", 30, 80, 5);

        double total = totalSalary(empl); // вызываем метод для расчета зарплаты
        System.out.println("Total salary: " + total);
        double average = averageAge(empl);
        System.out.println("Average age: " + average);
        double totalSales = totalSales(empl);
        System.out.println(totalSales);

    }

    private static double totalSalary(Employee_03[] empl){
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            if(empl[i] != null){
                sum += empl[i].calcSalary();
            }
        }
        return sum;
    }

    private static double averageAge(Employee_03[] empl) {
        double average = 0;
        for (int i = 0; i < empl.length; i++) {
            if(empl[i] != null){
                average += empl[i].getAge();
            }
        }
        return average / empl.length;
    }

    private static double totalSales(Employee_03[] empl){
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            if(empl[i] instanceof SalesManager_03){
                SalesManager_03 salesManager = (SalesManager_03) empl[i];
                sum += salesManager.getSalesValue();
            }
        }
        return sum;
    }

}

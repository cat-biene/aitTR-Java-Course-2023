package practice.dao;

import practice.model.Employee_01;

public interface Company_01 {

    // объявляем методы, только сигнатуры, без тела метода
    boolean addEmployee(Employee_01 employee);
    Employee_01 removeEmployee(int id);
    Employee_01 findEmployee(int id);
    int quantity();
    double totalSalary(); // - ФОТ, зарплата всех
    double avgSalary(); // средняя зарплата по компании, average - средний
    double totalSales(); // - объем продаж
    void printEmployees();
    //---------------------
//      - список работников, у которых отработано больше часов, чем...
    Employee_01[] findEmployeesHoursGreaterThan(int hours);
    //      - список работников, у которых зарплата в интервале от... и до...
    Employee_01[] findEmployeesSalaryRange(int minSalary, int maxSalary);
}

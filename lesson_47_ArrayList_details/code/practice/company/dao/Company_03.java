package practice.company.dao;

import practice.company.model.Employee_03;

public interface Company_03 {
// объявляем методы, только сигнатуры, без тела метода
    boolean addEmployee(Employee_03 employee);
    Employee_03 removeEmployee(int id);
    Employee_03 findEmployee(int id);
    int quantity();
    double totalSalary(); // - ФОТ, зарплата всех
    double avgSalary(); // средняя зарплата по компании, average - средний
    double totalSales(); // - объем продаж
    void printEmployees();
    //---------------------
//      - список работников, у которых отработано больше часов, чем...
    Employee_03[] findEmployeesHoursGreaterThan(int hours);
    //      - список работников, у которых зарплата в интервале от... и до...
    Employee_03[] findEmployeesSalaryRange(int minSalary, int maxSalary);

}

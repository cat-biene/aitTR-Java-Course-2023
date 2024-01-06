package practice.company.dao;

//    - добавить сотрудника
//    - удалить сотрудника
//    - найти сотрудника
//    - кол-во сотрудников
//    - ФОТ
//    - средняя з/п
//    - объем продаж
//    - напечатать список сотрудников

import practice.company.model.Employee_04;

public interface Company_04 {
    // объявляем методы, только сигнатуры, без тела метода
    boolean addEmployee(Employee_04 employee);
    Employee_04 removeEmployee(int id);
    Employee_04 findEmployee(int id);
    int quantity();
    double totalSalary(); // - ФОТ, зарплата всех
    double avgSalary(); // средняя зарплата по компании, average - средний
    double totalSales(); // - объем продаж
    void printEmployees();
    //---------------------
//      - список работников, у которых отработано больше часов, чем...
    Employee_04[] findEmployeesHoursGreaterThan(int hours);
    //      - список работников, у которых зарплата в интервале от... и до...
    Employee_04[] findEmployeesSalaryRange(int minSalary, int maxSalary);

}

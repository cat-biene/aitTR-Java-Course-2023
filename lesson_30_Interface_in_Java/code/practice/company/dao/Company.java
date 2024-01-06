package practice.company.dao;
// создаем интерфейс Company с методами:
// добавить сотрудника
// удалить сотрудника
// найти сотрудника
// кол-во сотрудников
// ФОТ
// средняя з/п
// объем продаж
// напечатать список сотрудников
// создаем класс CompanyImpl, который implements Company
// создаем класс CompanyImplTest, в котором создаем тесты для методов
// реализуем методы в классе CompanyImpl

import practice.company.model.Employee;

public interface Company {

    // объявляем методы, только сигнатуры, без тела метода
    boolean addEmployee(Employee employee);
    Employee removeEmployee(int id);
    Employee findEmployee(int id);
    int quantity();
    double TotalSalary();
    double averageSalary();
    double totalSales();
    void printEmployee();

}

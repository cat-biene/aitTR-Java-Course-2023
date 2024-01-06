package practice.company.dao;

import practice.company.model.Employee;

public class CompanyImpl implements Company {

    private Employee[] employees; // массив для хранения сотрудников
    private int size; // текущее кол-во сотрудников в компании

    public CompanyImpl(int capacity) {
        employees = new Employee[capacity];
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public Employee removeEmployee(int id) {
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        return null;
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public double TotalSalary() {
        return 0;
    }

    @Override
    public double averageSalary() {
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public void printEmployee() {

    }
}

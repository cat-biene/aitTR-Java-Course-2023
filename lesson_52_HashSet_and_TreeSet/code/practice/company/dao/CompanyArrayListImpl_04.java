package practice.company.dao;

import practice.company.model.Employee_04;
import practice.company.model.SalesManager_04;

import java.util.ArrayList;
import java.util.List;

public class CompanyArrayListImpl_04 implements Company_04 {
    // поля, которые описывают компанию
    List<Employee_04> employees; // вместо массива делаем List
    int capacity; // вместимость компании

//    конструктор
    public CompanyArrayListImpl_04(int capacity) {
        this.capacity = capacity; // это ограничение по кол-ву сотрудников в компании
        employees = new ArrayList<>(); // длину (размер) указывать не надо
    }

    // O(n)
    @Override
    public boolean addEmployee(Employee_04 employee) {
        // не добавляем null, не превышаем capacity, не добавляем уже существующий элемент
        if(employee == null || employees.size() == capacity || findEmployee(employee.getId()) != null) {
            return false;
        }
        employees.add(employee); // добавили в список сотрудника (элемент списка)
        return true;
    }

    // O(n)
    @Override
    public Employee_04 removeEmployee(int id) {
        Employee_04 victim = findEmployee(id);
        if (victim != null) { // а надо ли это проверять?
            employees.remove(victim);
            return victim;
        }
        return null;
    }

    // O(n)
    @Override
    public Employee_04 findEmployee(int id) {
        for (Employee_04 e : employees) { // e - это employee из списка employees
            if (e.getId() == id) {
                return e; // вернули найденный элемент
            }
        }
        return null;
    }

    // O(1)
    @Override
    public int quantity() {
        return employees.size(); // вернули длину списка
    }

    // O(n)
    @Override
    public double totalSalary() {
        double res = 0;
        for (Employee_04 e : employees) {
            res += e.calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        return totalSalary() / employees.size();
    }

    // O(n)
    @Override
    public double totalSales() {
        double res = 0;
        for (Employee_04 e : employees) {
            if(e instanceof SalesManager_04) {
                //    SalesManager salesManager = (SalesManager) e;
                res += ((SalesManager_04) e).getSalesValue();
            }
        }
        return res;
    }

    // O(n)
    @Override
    public void printEmployees() {
        for (Employee_04 e : employees) {
            System.out.println(e);
        }

    }

    @Override
    public Employee_04[] findEmployeesHoursGreaterThan(int hours) {
        int count = 0;
        for (Employee_04 e : employees) {
            if(e.getHours() > hours) {
                count++;
            }
        }
        Employee_04[] res = new Employee_04[count]; // создаем массив размером count
        count = 0;
        for (Employee_04 e : employees) {
            if(e.getHours() > hours){
                res[count] = employees.get(count);
                count++;
            }
        }
        return res;
    }

    // O(n)
    @Override
    // подсчет количества элементов, удовлетворяющих критерию
    public Employee_04[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        // O(1)
        int count = 0;
        // O(n)
        for (Employee_04 e : employees) {
            if (e.calcSalary() > minSalary && e.calcSalary() < maxSalary) {
                count++;
            }
        }
        // O(1)
        Employee_04[] res = new Employee_04[count]; // создали новый массив
        count = 0;
        // O(n)
        for (Employee_04 e : employees) {
            if (e.calcSalary() > minSalary && e.calcSalary() < maxSalary) {
                res[count] = e;
                count = count + 1;
            }
        }
        return res;
    }

}

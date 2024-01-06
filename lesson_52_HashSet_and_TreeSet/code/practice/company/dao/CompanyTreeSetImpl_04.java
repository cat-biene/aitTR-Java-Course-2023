package practice.company.dao;

import practice.company.model.Employee_04;
import practice.company.model.SalesManager_04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;

public class CompanyTreeSetImpl_04 implements Company_04 {

    // fields
    private final TreeSet<Employee_04> employees; // вместо List создаем TreeSet
    int capacity; // вместимость компании

    Comparator<Employee_04> comparator = new Comparator<Employee_04>() {
        public int compare(Employee_04 o1, Employee_04 o2) {
            return Integer.compare(o1.getId(), o2.getId());
        }
    };

    public CompanyTreeSetImpl_04(int capacity) {
        this.capacity = capacity; // это ограничение по кол-ву сотрудников в компании
        employees = new TreeSet<>(comparator); // длину (размер) указывать не надо
    }

    @Override
    public boolean addEmployee(Employee_04 employee) {
        if (employee == null || employees.size() == capacity) {
            return false;
        }
        return employees.add(employee);
    }

    @Override
    public Employee_04 removeEmployee(int id) {
        Employee_04 victim = findEmployee(id);
        employees.remove(victim);
        return victim;
    }

    @Override
    public Employee_04 findEmployee(int id) {
        for (Employee_04 e : employees) { // e - это employee из списка employees
            if (e.getId() == id) {
                return e; // вернули найденный элемент
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return employees.size();
    }

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

    @Override
    public void printEmployees() {
        employees.forEach(e -> System.out.println(e));
    }

    @Override
    public Employee_04[] findEmployeesHoursGreaterThan(int hours) {
        return findEmployeesByPredicate(e -> e.getHours() >= hours);
    }

    private Employee_04[] findEmployeesByPredicate(Predicate<Employee_04> predicate) {
        List<Employee_04> res = new ArrayList<>();
        for (Employee_04 employee : employees) {
            if(predicate.test(employee)) {
                res.add(employee);
            }
        }
        return res.toArray(new Employee_04[0]); // новинка!!!
    }

    @Override
    public Employee_04[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        return findEmployeesByPredicate(e -> e.calcSalary() >= minSalary && e.calcSalary() < maxSalary);
    }
}

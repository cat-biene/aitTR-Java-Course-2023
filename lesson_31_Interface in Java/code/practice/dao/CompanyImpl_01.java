package practice.dao;

import practice.model.Employee_01;
import practice.model.SalesManager_01;
import practice.model.Manager_01;
import practice.model.Worker_01;

public class CompanyImpl_01 implements Company_01{
    // поля, которые описывают компанию
    private Employee_01[] employees; // сотрудники - массив для хранения сотрудников
    private int size; // текущее кол-во сотрудников в компании

    // конструктор
    public CompanyImpl_01(int capacity){
        employees = new Employee_01[capacity]; // capacity - максимальный размер компании
    }

    @Override
    public boolean addEmployee(Employee_01 employee) {
        // не добавляем null, не превышаем capacity, не добавляем уже существующий элемент
        if( employee == null || size == employees.length || findEmployee(employee.getId()) != null) {
            return false;
        }
//        employees[size] = employee; // новый элемент
//        size++;
        employees[size++] = employee; // ++ - это постфиксная операция
        return true;
    }

    @Override
    public Employee_01 removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id){
                Employee_01 victim = employees[i]; // убрали найденный элемент в переменную
//                employees[i] = employees[size - 1]; // на место найденного поставили последнего существ. в массиве
//                employees[size - 1] = null; // обнулили последнего
//                size--;
//          можно написать короче этот код TODO
                employees[i] = employees[--size]; // - префиксная операция
                employees[size] = null; // обнуляем последний элемент
                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee_01 findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id){ // нашелся элемент массива, у которого совпал id
                return employees[i]; // вернули найденный элемент массива типа Employee
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    // удалить
    @Override
    public double totalSalary() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            res += employees[i].calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        return totalSalary() / size;
    }

    @Override
    public double totalSales() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i] instanceof SalesManager_01){
                SalesManager_01 salesManager = (SalesManager_01) employees[i]; // провели кастинг
                res += salesManager.getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    //    Для выборки элементов из массива, удовлетворяющих заданному условию, надо:
//    - сначала подсчитать количество элементов массива, удовлетворяющих условию.
//    - потом создать массив под это количество,
//    - и только потом его заполнить.
    @Override
    public Employee_01[] findEmployeesHoursGreaterThan(int hours) {
        int count = 0;
        // считаем сколько будет элементов массива, удовлетворяющих условию
        for (int i = 0; i < size; i++) {
            if(employees[i].getHours() > hours){
                count++;
            }
        }
        Employee_01[] res = new Employee_01[count]; // создаем массив размером count
        // заполняем массив res
        for (int i = 0, j = 0; j < res.length; i++) {
            if(employees[i].getHours() > hours){
                res[j++] = employees[i];
            }
        }
        return res; // это возвращаемый массив
    }

    @Override
    public Employee_01[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        // считаем сколько будет элементов массива, удовлетворяющих условию
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i].calcSalary() > minSalary && employees[i].calcSalary() < maxSalary) {
                count++;
            }
        }
        Employee_01[] res = new Employee_01[count]; // создаем массив размером count
        // заполняем массив res
        for (int i = 0, j = 0; j < res.length; i++) {
            if(employees[i].calcSalary() > minSalary && employees[i].calcSalary() < maxSalary){
                res[j++] = employees[i];
            }
        }
        return res; // это возвращаемый массив
    }

}

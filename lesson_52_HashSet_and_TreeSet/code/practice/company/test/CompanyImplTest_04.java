package practice.company.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.company.dao.Company_04;
import practice.company.dao.CompanyTreeSetImpl_04;
import practice.company.model.Employee_04;
import practice.company.model.Manager_04;
import practice.company.model.SalesManager_04;
import practice.company.model.Worker_04;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest_04 {

    Company_04 company;
    Employee_04[] e;

    // добавить comparator по id для сортировки массивов перед assertArrayEquals
    Comparator<Employee_04> comparator = new Comparator<Employee_04>() {
        @Override
        public int compare(Employee_04 o1, Employee_04 o2) {
            return Integer.compare(o1.getId(), o2.getId());
        }
    };

    @BeforeEach
    void setUp() {
        company = new CompanyTreeSetImpl_04(5); // создан объект класса CompanyArrayListImpl
        e = new Employee_04[4];
        e[0] = new Manager_04(101, "John", "Smith", 45, 160, 5000, 5);
        e[1] = new SalesManager_04(102, "Anna", "Black", 36, 160, 25000, 0.1);
        e[2] = new SalesManager_04(103, "Thomas", "White", 28, 160, 30000, 0.1);
        e[3] = new Worker_04(104, "Gans", "Bauer", 30, 80, 5);

        // добавим элементы массива в company
        for (int i = 0; i < e.length; i++) {
            company.addEmployee(e[i]);
        }
    }

    @Test
    void addEmployee() {
        // не можем добавить null - пустой объект
        assertFalse(company.addEmployee(null));
        // не можем добавить второй раз, уже существующего работника
        assertFalse(company.addEmployee(e[1]));
        Employee_04 employee = new Manager_04(105, "Ivan", "Dubin", 55, 160, 6000, 6); // создали нового сотрудника
        assertTrue(company.addEmployee(employee)); // добавили нового сотрудника
        assertEquals(5, company.quantity()); // теперь в компании 5 сотрудников
        // создаем еще одного нового
        Employee_04 employee2 = new Manager_04(106, "Peter", "Dubin", 55, 160, 6000, 6); // создали нового сотрудника
        assertFalse(company.addEmployee(employee2)); // не можем превысить capacity
        company.printEmployees();
    }

    @Test
    void removeEmployee() {
        // удаляем сотрудника
        company.printEmployees();
        System.out.println("---------------------");
        assertEquals(e[1], company.removeEmployee(102));
        assertEquals(3, company.quantity()); // сотрудников стало на 1 меньше (4 - 1)
        //assertNull(company.removeEmployee(102)); // дважды не можем удалить
        assertNull(company.findEmployee(102)); // не можем найти после удаления
        company.printEmployees();
    }

    @Test
    void findEmployee() {
        company.printEmployees();
        // ищем сотрудника по id
        assertEquals(e[1], company.findEmployee(102));
        // ищем несуществующего сотрудника
        assertNull(company.findEmployee(105));
    }

    @Test
    void quantityTest() {
        assertEquals(4, company.quantity());

    }

    @Test
    void totalSalaryTest() {
        assertEquals(11700., company.totalSalary(), 0.01);
    }

    @Test
    void avgSalaryTest() {
        assertEquals( 11700.0 / 4, company.avgSalary(), 0.01);
    }

    @Test
    void totalSalesTest() {
        assertEquals(55000, company.totalSales());
    }

    @Test
    void printEmployeesTest() {

        company.printEmployees();
    }

    @Test
    void findEmployeesHoursGreaterThanTest(){
        Employee_04[] actual = company.findEmployeesHoursGreaterThan(100);
        Arrays.sort(actual, comparator); // сортировка по id
        Employee_04[] expected = {e[0], e[1], e[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findEmployeesSalaryRangeTest(){
        company.printEmployees();
        Employee_04[] actual = company.findEmployeesSalaryRange(2900, 6000);
        Arrays.sort(actual, comparator); // сортировка по id
        Employee_04[] expected = {e[0], e[2]};
        assertArrayEquals(expected, actual);
        System.out.println(Arrays.toString(actual));
    }
}

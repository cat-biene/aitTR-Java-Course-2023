package practice.employee_save_read;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class SaveEmployeeAppl {

    public static void main(String[] args) {

        Address address1 = new Address("Berlin", "Hans", 13, 3);
        Address address2 = new Address("Berlin", "Hans", 11, 1);
        Employee employee1 = new Employee(1, "Peter", LocalDate.of(1996, 5,20), 2500, address1);
        Employee employee2 = new Employee(2, "Yan", LocalDate.of(1990, 1,1), 2600, address2);

        Set<Employee> employees = new HashSet<>();
        employees.add(employee1);
        employees.add(employee2);
        // делаем новый объект из класса ObjectOutputStream
        try {
            ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("./dest/employees.dat"));
            ous.writeObject(employees);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

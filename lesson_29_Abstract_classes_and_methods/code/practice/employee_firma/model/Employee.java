package practice.employee_firma.model;
// Задание:
// создать абстрактный класс practice.model.
// Employee и определить в нем абстрактный метод calcSalary()
// создать дочерние классы practice.model.
// Manager, practice.model.SalesManager и Worker,
// реализовать в них методы начисления зарплаты:
// practice.model.Manager: base + grade*hours
// practice.model.SalesManager: salesValue * percent
// Worker: grade*hours
// в приложении EmployeeAppl "нанять" в компанию несколько сотрудников (массив до 10 элементов) и
// подсчитать общий годовой объем зарплаты и средний возраст сотрудников компании.

public abstract class Employee {

    //fields
    protected final int id;
    protected String firstName;
    protected String lastName;
    protected int age;
    protected double hours;

    //constructor


    public Employee(int id, String firstName, String lastName, int age, double hours) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hours = hours;
    }

    //getter and setter

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    // equals and hashCode

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Employee employee = (Employee) object;

        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    // toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Employee ");
        sb.append("id = ").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", hours=").append(hours);
        sb.append(", salary=").append(calcSalary());
        return sb.toString();
    }

    public abstract double calcSalary(); // определили абстрактный метод ( у него нет тела)

}

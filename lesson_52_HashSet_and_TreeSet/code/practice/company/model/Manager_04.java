package practice.company.model;

public class Manager_04 extends Employee_04 {

    private double baseSalary;
    private int grade;

    public Manager_04(int id, String firstName, String lastName, int age, double hours, double baseSalary, int grade) {
        super(id, firstName, lastName, age, hours);
        this.baseSalary = baseSalary;
        this.grade = grade;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary = baseSalary + grade * hours;
        return salary;
    }
}

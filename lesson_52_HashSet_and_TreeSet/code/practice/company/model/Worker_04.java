package practice.company.model;

public class Worker_04 extends Employee_04 {
    private double grade;

    public Worker_04(int id, String firstName, String lastName, int age, double hours, double grade) {
        super(id, firstName, lastName, age, hours);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary = hours * grade;
        return salary;
    }
}

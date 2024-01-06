package practice.employee_firma.model;

public class Worker extends Employee{

    //fields
    private double grade;

    //constructor
    public Worker(int id, String firstName, String lastName, int age, double hours, double grade) {
        super(id, firstName, lastName, age, hours);
        this.grade = grade;
    }

    // getter and setter
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

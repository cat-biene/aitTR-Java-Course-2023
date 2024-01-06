package practice.model;

public class SalesManager_01 extends Employee_01{
    private double salesValue;
    private double percent;

    public SalesManager_01(int id, String firstName, String lastName, int age, double hours, double salesValue, double percent) {
        super(id, firstName, lastName, age, hours);
        this.salesValue = salesValue;
        this.percent = percent;
    }

    public double getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(double salesValue) {
        this.salesValue = salesValue;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public double calcSalary() {
        double salary = salesValue * percent;
        return salary;
    }

}

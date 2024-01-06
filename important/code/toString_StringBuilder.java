public class toString_StringBuilder {

    //поля класса
    protected int id;
    protected String firstName;
    protected String lastName;
    protected int age;
    protected double hours;

    public String toString() {
        StringBuilder sb = new StringBuilder("Employee ");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", hours=").append(hours);
        return sb.toString();
    }
}

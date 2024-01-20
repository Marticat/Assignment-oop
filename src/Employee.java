public class Employee extends Person {
    private String position;
    private double salary;
    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee: " + getId() + ". " + getName() + " " + getSurname();
    }
    public String getPosition() {
        return position;
    }
    public double getSalary() {
        return salary;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
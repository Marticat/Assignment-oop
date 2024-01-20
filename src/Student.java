public class Student extends Person {
    private double gpa;

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return "Student: " + getId() + ". " + getName() + " " + getSurname();
    }

    public double getGpa() {
        return gpa;
    }
    @Override
    public double getPaymentAmount() {
        return (gpa > 2.67) ? 36660.0 : 0.0;
    }
}

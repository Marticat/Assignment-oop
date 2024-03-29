public class Person implements Payable, Comparable<Person> {
    private static int nextId = 1;
    private int id;
    private String name;
    private String surname;

    public Person() {
        id = nextId++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public String getSurname() { return surname; }

    public void setName(String name) { this.name = name; }

    public void setSurname(String surname) { this.surname = surname; }

    public String getPosition() { return "Student"; }

    @Override
    public String toString() { return id + ". " + name + " " + surname; }

    @Override
    public double getPaymentAmount() { return 0.0; }

    @Override
    public int compareTo(Person other) {
        return Double.compare(getPaymentAmount(), other.getPaymentAmount());
    }
}
public class Employee extends Person{

    private int salary;

    public Employee(String name, String age, String occupation, int salary) {
        super(name, age, occupation);
        this.salary = salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Person john = new Manager("John Smith", "27", "Java Developer", true);
        john.bigSalary();
        System.out.println(john.getOccupation().toUpperCase());
        Person maria = new Employee("Maria do Bairro", "22","Trainee",1800);
        maria.bigSalary();

    }
}

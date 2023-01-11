package Method_Return;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Jessica";
        person1.weight = 65.3;
        person1.height = 1.65;

        System.out.println(person1.imc());    
    }
}

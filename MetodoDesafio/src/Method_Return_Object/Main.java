package Method_Return_Object;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Jessica";
        person1.weight = 65.3;
        person1.height = 1.65;

        ImcResult imcPerson1 = person1.calcImc();

        System.out.println(imcPerson1.result);


    }
}

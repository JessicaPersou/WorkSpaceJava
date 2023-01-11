package Method_Obj_Args;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Jessica";


        ImcResult imcPerson1 = person1.calcImc(1.65,65.3 );

        System.out.println(imcPerson1.result);


    }
}

package Method_Args;

import Method_Obj_Args.Client;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Jessica";

        Client person2 = new Client();
        person2.weight = 65.5;
        person2.height = 1.65;

        ImcResult imcPerson1 = person1.calcImc(person2);

        System.out.println(imcPerson1.result);


    }
}

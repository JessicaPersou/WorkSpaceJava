public class AttributesAndMethods {
    public static void main(String[] args) {
        /*User jessi = new User();
        Animal cachorro = new Animal();*/

        Dog dog1 = new Dog();
        dog1.name = "Mel";
        dog1.breed = "Vira=Lata";
        dog1.gender = "Femêa";
        dog1.age = 1;
        dog1.guardian = new People();
        dog1.guardian.name = "Jessica";
        dog1.guardian.doc = "01223334444";
        dog1.guardian.age = 29;
        dog1.sleep(); //ele chama o metodo aqui

        System.out.println("----------------------------");
        System.out.println("Ficha 1: " + dog1.name);
        System.out.println("Raça: " + dog1.breed);
        System.out.println("Sexo: " + dog1.gender);
        System.out.println("Idade: " + dog1.age);


        /*Dog dog2 = new Dog();
        dog2.name = "Marley";
        dog2.breed = "Bulldog Inglês";
        dog2.gender = "Macho";
        dog2.age = 4;

        System.out.println("----------------------------");
        System.out.println("Ficha 2: "+ dog2.name);
        System.out.println("Raça: " + dog2.breed);
        System.out.println("Sexo: " + dog2.gender);
        System.out.println("Idade: " + dog2.age);*/

    }
}

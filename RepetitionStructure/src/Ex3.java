import java.util.Scanner;

public class Ex3 {
    /*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
     * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = 0, count21 = 0, count50 = 0;

        while(age > -99) {
            System.out.println("Insert your age: ");
            age = sc.nextInt();

            if (age <= 21) {
                count21+=1;
            }
            if (age >= 50) {
                count50+=1;
            }
        }       System.out.println("Total of people with 21 years old: " + count21);
                System.out.println("Total of people with 50 years old: " + count50);
    }
}

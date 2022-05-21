import java.util.Scanner;

public class Ex1 {
    /*Faça um sistema que leia a idade de uma pessoa expressa em anos,
     * meses e dias e mostre-a expressa apenas em dias.*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your age: ");
        int age = sc.nextInt();;
        int year = 365 * age;

        System.out.println("Your age in days is: " + year);
    }
}

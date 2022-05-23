import java.util.Scanner;

public class Ex3 {
    /*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
            10-14 infantil
            15-17 juvenil
            18-25 adulto*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your age: ");
        int age = sc.nextInt();

        if(age >= 10 && age <= 14){
            System.out.println("You is childish");
        } else if (age >= 15 && age <= 17) {
            System.out.println("You is juvenile");
        } else if (age >= 18 && age <= 25){
            System.out.println("You is teenager");
        }else{
            System.out.println("You have another age, we don't have products for you!");
        }
    }
}

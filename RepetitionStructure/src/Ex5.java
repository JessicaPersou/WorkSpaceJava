import java.util.Scanner;

public class Ex5 {
    /*Crie um programa que leia um número do teclado até que encontre um número igual a zero.
    No final, mostre a soma dos números digitados.(DO...WHILE)*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, show = 0;
        do {
            System.out.println("Insert a number:");
            number = sc.nextInt();
            show+=number;
        }while(number != 0);
        System.out.println("The sum of all number is: " + show);
    }
}

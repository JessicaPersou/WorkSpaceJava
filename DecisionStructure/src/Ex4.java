import java.util.Scanner;

public class Ex4 {
    /*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
     * Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number: ");
        double number = sc.nextDouble();

        if(number % 2 != 0){
            double odd = number * number;
            System.out.println("Number is Odd (" + number + ") and your square root is: " + odd); //odd - ímpar
        }else{
            double even = Math.pow(number, 2);
            System.out.println("Number is Even (" + number + "), and your square root is: " + even); // even - par
        }

    }
}

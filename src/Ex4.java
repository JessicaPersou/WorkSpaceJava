import java.awt.*;
import java.util.Scanner;

public class Ex4 {
    /*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C)
e calcule a seguinte expressão: d=r+s/2, onde r=(a+b)² e s=(b+c)²*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, r, s;
        System.out.println("Insert a value for A: ");
        int a = sc.nextInt();
        System.out.println("Insert a value for B: ");
        int b = sc.nextInt();
        System.out.println("Insert a value for C: ");
        int c = sc.nextInt();

        s=(b+c)*(b+c);
        r=(a+b)*(a+b);
        d=r+s/2;

        System.out.println("The value for D is: " + d);
    }
}

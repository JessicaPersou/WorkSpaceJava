import java.util.Scanner;

public class Ex2 {
    /*Faça um programa que entre com três números e coloque em ordem crescente.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Insert first number: ");
        n1 = sc.nextInt();
        System.out.println("Insert second number: ");
        n2 = sc.nextInt();
        System.out.println("Insert third number: ");
        n3 = sc.nextInt();

        if(n1<=n2 && n2<=n3) {
            System.out.println("1º " + n1 + " - 2º " + n2 + " - 3º " + n3);
        }else if(n1<=n3 && n2<=n2) {
            System.out.println("1º " + n1 + " - 2º " + n3 + " - 3º " + n2);
        }else if(n2<=n1 && n1<=n3){
            System.out.println("1º " + n2 + " - 2º " + n1 + " - 3º " + n3);
        }else if(n2 <= n3 && n3 <= n1)  {
            System.out.println("1º " + n2 + " - 2º " + n3 + " - 3º " + n1);
        } else if (n3 <= n1 && n1 <= n2){
            System.out.println("1º " + n3 + " - 2º " + n1 + " - 3º " + n2);
        }else /* n3 <= n2 && n2 < n1 */{
            System.out.println("1º " + n3 + " - 2º " + n2 + " - 3º " + n1);
        }
    }
}

import java.util.Scanner;

public class Ex6 {
    /*6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano,
    P(x1, y1) e P(x2, y2), escreva a distância entre eles.A fórmula que efetua tal cálculo é:
    d=(x2-x1)²+(y2-y1)²*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert a value for X1: ");
        int x1 = sc.nextInt();
        System.out.println("Insert a value for X2: ");
        int x2 = sc.nextInt();
        System.out.println("Insert a value for Y1: ");
        int y1 = sc.nextInt();
        System.out.println("Insert a value for Y2: ");
        int y2 = sc.nextInt();

        int d = ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1));

        System.out.println("The distance is: " + d);
    }
}

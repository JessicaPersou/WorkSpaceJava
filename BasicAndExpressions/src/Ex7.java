import java.util.Scanner;

public class Ex7 {
    /*7. Um sistema de equações lineares do tipo: ax+by=c|dx+ey=f,
	pode ser resolvido segundo mostrado abaixo : x=ce-bf/ae-bc | y=af-cd/ae-bd

	Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.
	*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert a value for A: ");
        int a = sc.nextInt();
        System.out.println("Insert a value for B: ");
        int b = sc.nextInt();
        System.out.println("Insert a value for C: ");
        int c = sc.nextInt();
        System.out.println("Insert a value for D: ");
        int d = sc.nextInt();
        System.out.println("Insert a value for E: ");
        int e = sc.nextInt();
        System.out.println("Insert a value for F: ");
        int f = sc.nextInt();

        int x = ((c*e)-(b*f))/((a*e)-(b*c));

        int y = ((a*f)-(c*d))/((a*e)-(b*d));

        System.out.println("The value for X is: " + x);
        System.out.println("The value for Y is: " + y);
    }
}

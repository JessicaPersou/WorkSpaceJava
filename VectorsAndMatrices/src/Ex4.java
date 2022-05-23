import java.util.Scanner;
/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
 */
public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrices[][] = new int[3][3], l,c,soma = 0;
        for( l=0;l<3;l++) {
            for( c=0;c<3;c++) {
                System.out.print("Insert a number: ");
                matrices[l][c]=sc.nextInt();
            }
        }	System.out.println("Sum diagonal main:" + (matrices[0][0] + matrices[1][1]+ matrices[2][2]) + "\t");
    }
}
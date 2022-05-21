import java.util.Scanner;

public class Ex5 {
    /*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.
     *  Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert note one:");
        double one = sc.nextDouble();
        System.out.println("Insert note two:");
        double two = sc.nextDouble();
        System.out.println("Insert note three:");
        double three = sc.nextDouble();

        double noteOne = one * 2;
        double noteTwo = two * 3;
        double noteThree = three * 5;

        double average = (noteOne + noteTwo + noteThree)/ 10;

        System.out.println("The average is: " + average);
    }
}

import java.util.Scanner;

public class Ex8 {
    /*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem
	do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do
	distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a Factory value: ");
        double valueFactory = sc.nextDouble();
        double pDispenser = (valueFactory*28)/100;
        double tax = (valueFactory*45)/100;

        double sum = valueFactory + pDispenser + tax ;

        System.out.println("The value of Car is: " + sum);

    }
}

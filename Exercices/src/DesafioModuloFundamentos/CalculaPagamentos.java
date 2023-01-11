package DesafioModuloFundamentos;

import java.util.Scanner;

public class CalculaPagamentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos Calcular a sua Folha de Pagamento?");
        System.out.println("Qual o seu nome?");
        String name = sc.nextLine();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        int workHours = sc.nextInt();
        System.out.println("Informe o valor da hora trabalhada: ");
        double valueForHour = sc.nextDouble();
        sc.nextLine();
        System.out.println("Informe o valor a ser descontado:");
        double valueForRebate = sc.nextDouble();
        sc.nextLine();
        System.out.printf("Estamos calculando e já vamos te informar %s!%n", name);
        double result = workHours * valueForHour;
        double calc = result - valueForRebate;

        System.out.printf("Folha de Pagamento: %s%n", name);
        System.out.printf("%d horas x R$ %.2f = R$ %.2f%n", workHours, valueForHour, result);
        System.out.printf("Descontos: R$ %.2f%n", valueForRebate);
        System.out.printf("Total devido: R$ %.2f%n", calc);

    }
}

package Desafio1;

public class Main {
    public static void main(String[] args) {
        FolhaPagamento funcionarioJoao = new FolhaPagamento();
        double calc = funcionarioJoao.calcularSalario(160,90,50.00,75.00);

        System.out.printf("Calculando o salário do Funcionário João: R$ %.2f%n",calc);
        //printf imprime o valor formatado
    }

}

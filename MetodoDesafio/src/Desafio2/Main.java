package Desafio2;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome ="Andre";
        funcionario.quantiFilhos = 2;

        ContratoTrabalho contrato = new ContratoTrabalho();
        contrato.funcionario = funcionario;
        contrato.valorHoraNormal = 51.8;
        contrato.valorHoraExtra = 60.5;

        FolhaPagamentoRefactore folha1 = new FolhaPagamentoRefactore();
        double calcSalario = folha1.calcular(contrato,160,10);

        System.out.printf("Salário: R$ %.2f%n", calcSalario);

    }
}

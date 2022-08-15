import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DescontosDoEmpregado dev = new DescontosDoEmpregado();

        /*System.out.println("Informe o seu primeiro nome: ");
        dev.nome = sc.next();
        System.out.println("Olá, " + dev.nome + " me informe o salário bruto por favor: "  );
        dev.salario = sc.nextDouble();
        System.out.println("O seu salário líquido é: " + dev.descontoINSS());*/

        Pessoa f1 = new Pessoa();
        f1.nome = "Jõao";
        f1.salarioLiquido = 4050.00;

        System.out.println("o seu salario e R$: " +  dev.descontoINSS(f1));
    }

}

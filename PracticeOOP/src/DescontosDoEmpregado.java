public class DescontosDoEmpregado {


    double descontoINSS(Pessoa pessoa){

        double desconto;

        if(pessoa.salarioLiquido <= 1212.00){
            desconto = (pessoa.salarioLiquido * 7.5)/100;
            System.out.println("Valor de desconto e: " + desconto);
            pessoa.salarioLiquido = pessoa.salarioLiquido - desconto;

        } else if (pessoa.salarioLiquido >= 1212.01 && pessoa.salarioLiquido <= 2427.35) {

            desconto = (pessoa.salarioLiquido * 9)/100;
            System.out.println("Valor de desconto e: " + desconto);
            pessoa.salarioLiquido = pessoa.salarioLiquido - desconto;

        } else if (pessoa.salarioLiquido >= 2427.36 &&  pessoa.salarioLiquido <= 3641.03 ) {

            desconto = (pessoa.salarioLiquido * 12)/100;
            System.out.println("Valor de desconto e: " + desconto);
            pessoa.salarioLiquido = pessoa.salarioLiquido - desconto;

        } else if (pessoa.salarioLiquido >= 3641.04 && pessoa.salarioLiquido <= 7087.22 ) {

            desconto = (pessoa.salarioLiquido * 14)/100;
            System.out.println("Valor de desconto e: " + desconto);
            pessoa.salarioLiquido = pessoa.salarioLiquido - desconto;

        }
        return pessoa.salarioLiquido;
        
    }
}

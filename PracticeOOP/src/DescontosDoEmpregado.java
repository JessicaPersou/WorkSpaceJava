public class DescontosDoEmpregado {

    double descontoINSS(double salarioLiquido){

        double desconto;

        if(salarioLiquido <= 1212.00){
            desconto = (salarioLiquido * 7.5)/100;
            System.out.println("Valor de desconto e: " + desconto);
            salarioLiquido = salarioLiquido - desconto;

        } else if (salarioLiquido >= 1212.01 && salarioLiquido <= 2427.35) {

            desconto = (salarioLiquido * 9)/100;
            System.out.println("Valor de desconto e: " + desconto);
            salarioLiquido = salarioLiquido - desconto;

        } else if (salarioLiquido >= 2427.36 &&  salarioLiquido <= 3641.03 ) {

            desconto = (salarioLiquido * 12)/100;
            System.out.println("Valor de desconto e: " + desconto);
            salarioLiquido = salarioLiquido - desconto;

        } else if (salarioLiquido >= 3641.04 && salarioLiquido <= 7087.22 ) {

            desconto = (salarioLiquido * 14)/100;
            System.out.println("Valor de desconto e: " + desconto);
            salarioLiquido = salarioLiquido - desconto;

        }
        return salarioLiquido;
        
    }
}

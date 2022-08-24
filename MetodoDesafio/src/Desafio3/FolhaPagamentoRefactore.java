package Desafio3;

public class FolhaPagamentoRefactore {

    double calcularHoraNormal(ContratoTrabalho contratoTrabalho, int horaNormal){
        double calcNormal = contratoTrabalho.valorHoraNormal * horaNormal;

        if(contratoTrabalho.possuiFilho()){

            calcNormal *= 1.20;
        }
        return calcNormal;
    }


    double calcularHoraExtra(ContratoTrabalho contratoTrabalho, int horaExtra){
        double calcExtra = contratoTrabalho.valorHoraExtra * horaExtra;

        return calcExtra;
    }

    

}

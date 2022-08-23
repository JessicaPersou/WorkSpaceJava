package Desafio2;


public class FolhaPagamentoRefactore {

    double calcular(ContratoTrabalho contratoTrabalho, int horaNormal, int horaExtra){
        double calcExtra = contratoTrabalho.valorHoraExtra * horaExtra;
        double calcNormal = contratoTrabalho.valorHoraNormal * horaNormal;
        double valorTotal = calcNormal + calcExtra;
       if(contratoTrabalho.possuiFilho()){

           valorTotal *= 1.20;
       }

        return  valorTotal;
    }

}

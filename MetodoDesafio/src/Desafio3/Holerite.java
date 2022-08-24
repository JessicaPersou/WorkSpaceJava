package Desafio3;

public class Holerite {

    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double valorAdicionalFilho;

    double calcularHoraNormal(ContratoTrabalho contratoTrabalho, int horaNormal){
        this.valorTotalHorasNormais = contratoTrabalho.valorHoraNormal * horaNormal;

        if(contratoTrabalho.possuiFilho()){

            this.valorTotalHorasNormais *= 1.20;
        }
        return this.valorTotalHorasNormais;
    }


    double calcularHoraExtra(ContratoTrabalho contratoTrabalho, int horaExtra){
        this.valorTotalHorasExtras = contratoTrabalho.valorHoraExtra * horaExtra;

        return this.valorTotalHorasExtras;
    }

    double somandoTotal(double extra,double normal){
        extra = this.valorTotalHorasExtras;
        normal = this.valorTotalHorasNormais;

        return extra + normal;
    }



}

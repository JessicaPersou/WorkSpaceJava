package Desafio2;

public class ContratoTrabalho {

    Funcionario funcionario;
    double valorHoraExtra;
    double valorHoraNormal;

    boolean possuiFilho(){
        return funcionario.quantiFilhos();
    }


}

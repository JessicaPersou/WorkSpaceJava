package Desafio2;

public class Funcionario {
    String nome;
    int quantiFilhos;

    boolean quantiFilhos(){
        return quantiFilhos >0;
    }

    void nomeFuncionario(String nome){
        System.out.printf("O nome do funcionário é: %d %n", this.nome);
    }
}

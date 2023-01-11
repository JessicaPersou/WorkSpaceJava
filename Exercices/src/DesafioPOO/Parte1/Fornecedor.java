package DesafioPOO.Parte1;

public class Fornecedor {

    private String nome;

    Fornecedor(){

    }

    Fornecedor(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

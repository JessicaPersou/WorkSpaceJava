package Desafio9;

public class Cachorro extends Animal{

    protected String nome;

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Eu sou o cachorro e estou emitindo um latido: Au Au Au...");
    }

    @Override
    public void alimentar() {
        System.out.println("O cachorro come ração");
    }

    public Cachorro() {

    }
    public Cachorro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

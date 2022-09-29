package Desafio6;


public class Sobreposicao {
    private String produto;
    private boolean perecivel;

    //construtores
    public Sobreposicao() {
    }

    public Sobreposicao(String produto, boolean perecivel) {
        this.produto = produto;
        this.perecivel = perecivel;
    }

    public void sobreposicao(){
        System.out.println("O produto: " + this.produto + ".\n Perecível: " + this.perecivel);
    }

    //getters and setters
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public boolean isPerecivel() {
        return perecivel;
    }

    public void setPerecivel(boolean perecivel) {
        this.perecivel = perecivel;
    }
}

package DesafioPOO.Parte1;

public class ContaPagar {
    private String descricao;
    private double valor;
    private String dataVencimento;

    Fornecedor fornecedor;

    ContaPagar(){

    }

    ContaPagar(Fornecedor Fornecedor, String descricao, double valor, String dataVencimento){
            this.fornecedor = Fornecedor;
            this.descricao = descricao;
            this.valor = valor;
            this.dataVencimento = dataVencimento;
    }

    String pagar(){
             System.out.println(fornecedor.getNome() + ": recebemos o valor R$ " + getValor() +
                " referente ao vencimento: " + getDataVencimento());
        System.out.println("Sua conta está paga!");
        return descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}

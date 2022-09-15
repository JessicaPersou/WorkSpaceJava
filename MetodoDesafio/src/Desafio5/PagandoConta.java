package Desafio5;

public class PagandoConta {
    public static void main(String[] args) {
        ContaPagar internet = new ContaPagar();
        internet.pagar(internet.getSituacaoConta());
    }
}

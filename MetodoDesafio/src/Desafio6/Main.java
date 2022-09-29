package Desafio6;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        TesteSobreposicao testeProduto = new TesteSobreposicao();
        testeProduto.setProduto("Nescau");
        testeProduto.setPerecivel(false);
        testeProduto.setValidade(new Date());
        testeProduto.sobreposicao();
    }
}

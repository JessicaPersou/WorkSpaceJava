package Desafio5;

public class ContaPagar {
    SituacaoConta situacaoConta;

    public ContaPagar(){    //Todas as contas são instânciadas com o status pendente, construotr padrão.
        this.situacaoConta = SituacaoConta.PENDENTE;
    }

    public ContaPagar(SituacaoConta situacaoConta){    //construtor com parametros.
        this.situacaoConta = SituacaoConta.PENDENTE;
    }

    public void pagar(SituacaoConta situacaoConta) {
        if(situacaoConta == SituacaoConta.CANCELADA || situacaoConta == SituacaoConta.PAGA){
            System.out.println("Essa conta está cancelada ou já foi paga!");
        }
        if(situacaoConta == SituacaoConta.PENDENTE){
            this.situacaoConta = SituacaoConta.PAGA;
        }

    }

    public SituacaoConta getSituacaoConta() { // Aqui somente o getter para que não alterem o status por meio da situação dela.
        return situacaoConta;
    }

}

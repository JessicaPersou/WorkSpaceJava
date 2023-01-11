package Desafio6;

import javax.management.remote.SubjectDelegationPermission;
import java.util.Date;

public class TesteSobreposicao extends Sobreposicao {

    private Date validade;


    @Override
    public void sobreposicao() {
        super.sobreposicao();
        System.out.println("\nValidade dia: " + this.validade );
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
}

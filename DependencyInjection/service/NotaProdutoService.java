package service;

import model.Cliente;
import model.Produto;
import notificar.NotificarEmail;

public class NotaProdutoService {
    public void emitir(Cliente cliente, Produto produto){
        NotificarEmail notificaNota = new NotificarEmail();
       // notificaNota.compraNotificaEmail(cliente, "Nota do produto: " + produto.getNome() + ", emitida!");
    }
}

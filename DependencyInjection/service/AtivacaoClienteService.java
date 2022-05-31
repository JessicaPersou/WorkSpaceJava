package service;

import model.Cliente;
import notificar.Notificador;
//import notificar.NotificarEmail; // deixa de existir e começa a depender da interface apenas

public class AtivacaoClienteService {
    private Notificador notificador;
    public AtivacaoClienteService(Notificador notificador){
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        //NotificarEmail enviandoEmail = new NotificarEmail(); // precisa instanciar para chamar o metodo e caso precise trocar é mais complicado fazer para milhares de outras classes
        //enviandoEmail.compraNotificaEmail(cliente, "Sua compra foi finalizada com sucesso, enviando email!");
        this.notificador.notificar(cliente, "Compra realizada com sucesso!");
    }
}

package service;

import model.Cliente;
import notificar.NotificarEmail;
public class ComprarService {
    public void comprou(Cliente cliente){
        cliente.comprou();
        NotificarEmail enviandoEmail = new NotificarEmail(); // precisa instanciar para chamar o metodo e caso precise trocar é mais complicado fazer para milhares de outras classes
        enviandoEmail.compraNotificaEmail(cliente, "Sua compra foi finalizada com sucesso, enviando email!");
        }
}

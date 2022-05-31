package notificar;

import model.Cliente;

public class NotificarEmail {
    public void compraNotificaEmail(Cliente cliente, String msg){
        System.out.println(cliente.getNome() + ", sua compra foi realizada com sucesso. Notificando por : " + cliente.getEmail());
    }
}

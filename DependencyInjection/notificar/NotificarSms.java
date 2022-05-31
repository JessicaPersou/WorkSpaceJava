package notificar;

import model.Cliente;

public class NotificarSms {
    public void notificarSms(Cliente cliente, String msg){
        System.out.println("Notificando cliente: " + cliente.getNome() +
                "por SMS : " + cliente.getTelefone() + msg);
    }
}

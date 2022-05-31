package notificar;

import model.Cliente;

public class NotificarSms implements Notificador  {
    @Override
    public void notificar(Cliente cliente, String msg){
        System.out.println("Notificando cliente: " + cliente.getNome() +
                ", por SMS : " + cliente.getTelefone() + " " +msg);
    }
}

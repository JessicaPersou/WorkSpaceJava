package notificar;

import model.Cliente;

public class NotificarEmail implements Notificador{
    @Override // implementando o método da interface notificador
    public void notificar(Cliente cliente, String msg){
        System.out.println(cliente.getNome() + ", sua compra foi realizada com sucesso. Notificando por : " + cliente.getEmail());
    }

}


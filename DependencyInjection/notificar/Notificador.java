package notificar;

import model.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String msg);
}

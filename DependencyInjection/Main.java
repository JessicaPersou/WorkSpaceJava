import model.Cliente;
import model.Produto;
import notificar.Notificador;
import notificar.NotificarEmail;
import notificar.NotificarSms;
import service.AtivacaoClienteService;

public class Main {
    public static void main(String[] args) {
        Cliente jessica = new Cliente("Jessica","jessica@jessica.com", "11983212877"); // cliente
        Produto whey = new Produto("Black Skull", 89); // compra

        Notificador notificador = new NotificarSms();

        AtivacaoClienteService ativacaoService = new AtivacaoClienteService(notificador);
        ativacaoService.ativar(jessica);




    }
}

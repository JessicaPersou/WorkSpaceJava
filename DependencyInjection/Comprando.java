public class Comprando {
    public void comprou(Cliente cliente){
        cliente.comprou();
        Email enviandoEmail = new Email();
        enviandoEmail.enviarEmail(cliente, "Sua compra foi finalizada, vamos enviar um brinde.");
        }
}

public class Comprar {
    public void comprou(Cliente cliente){
        cliente.comprou();
        Email enviarEmail = new Email();
        enviarEmail.enviarEmail(cliente, "Sua compra foi finalizada com sucesso, enviando email!");
        }
}

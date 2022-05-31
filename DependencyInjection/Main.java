import model.Cliente;
import model.Produto;
import service.ComprarService;
import service.NotaProdutoService;

public class Main {
    public static void main(String[] args) {
        Cliente jessica = new Cliente("Jessica","jessica@jessica.com", "11983202870"); // cliente
        Produto whey = new Produto("Black Skull", 89); // compra

        ComprarService gastando = new ComprarService();
        gastando.comprou(jessica);

        NotaProdutoService notaProduto = new NotaProdutoService();
        notaProduto.emitir(jessica,whey);
    }
}

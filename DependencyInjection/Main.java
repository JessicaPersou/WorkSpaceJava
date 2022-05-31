public class Main {
    public static void main(String[] args) {
        Cliente jessica = new Cliente("Jessica","jessica@jessica.com", "11983202870");
        Produto whey = new Produto("Black Skull", 89);

        Comprar gastando = new Comprar();
        gastando.comprou(jessica);

    }
}

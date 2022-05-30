public class Main {
    public static void main(String[] args) {
        Cliente jessica = new Cliente("Jessica", "11983202870");
        Produto whey = new Produto("Black Skull", 89);

        Comprando feito = new Comprando();
        feito.comprou(jessica);

    }
}

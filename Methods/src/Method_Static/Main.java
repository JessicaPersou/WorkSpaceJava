package Method_Static;

public class Main {
    public static void main(String[] args) {

        Product whey1 = new Product();
        whey1.expense = 50;
        whey1.sale = 70;

        Product.packing = 10;

        whey1.printExpensePacking();

        System.out.println(whey1.totalValue());
    }
}

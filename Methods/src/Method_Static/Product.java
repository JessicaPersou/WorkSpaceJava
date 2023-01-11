package Method_Static;

public class Product {
    static double packing;
    double expense;
    double sale;

    void alterExpense(double expense){
        this.expense = expense;
    }

    void printExpensePacking(){
        System.out.printf("Custo com embalagem: %.2f%n", packing);
    }

    double totalValue(){
        double total = Product.packing + this.sale;
        return total;
    }
}

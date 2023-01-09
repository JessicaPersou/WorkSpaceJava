package Method_Return_Object.Challenge_1;

public class Main {
    public static void main(String[] args) {
        Payrool pay1 = new Payrool();
        pay1.extraHour = 20;
        pay1.normalHour = 100;

        Employe je = new Employe();
        je.name = "Jessica";
        je.son = 0;

        Contract contract = new Contract();
        contract.extraHourValue = 50;
        contract.normalHourValue = 25;

        System.out.println(pay1.calcPayment(contract));
    }
}

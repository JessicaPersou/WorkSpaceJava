package Bank;

public class AccountInvestiment extends Account{

    public AccountInvestiment(Person person, int agency, int numberAccount, int balance) {
        super(person, agency, numberAccount, balance);
    }

    @Override
    public void printDemo() {
        super.printDemo();
        System.out.println("Investimentosssssss");
    }

//    @Override
//    public int getBalance() {
//        super.getBalance();
//        return 2000;
//    }
}

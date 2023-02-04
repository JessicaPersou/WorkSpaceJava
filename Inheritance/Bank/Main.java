package Bank;

public class Main {
    public static void main(String[] args) {

        Account person1Account = new Account(new Person("Jessica","123.123.123-12"),111, 152777, 200);
//        person1Account.setPerson();
//        person1Account.setAgency(111);
//        person1Account.setNumberAccount(152777);
//        person1Account.deposit(200);
        person1Account.withdraw(33);

//        person1Account.printDemo();

        System.out.println(person1Account);
//        AccountInvestiment person2Account = new AccountInvestiment();
//        person2Account.setPerson(new Person("Adriano", "000.111.999-90"));
//        person2Account.setAgency(222);
//        person2Account.setNumberAccount(555123);
//        person2Account.deposit(1000);
//        person2Account.withdraw(10);
//
//        person2Account.printDemo();
    }
}

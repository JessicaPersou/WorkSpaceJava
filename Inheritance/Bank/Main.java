package Bank;

public class Main {
    public static void main(String[] args) {

        Account person1Account = new Account();
        person1Account.setPerson(new Person("Jessica","123.123.123-12"));
        person1Account.setAgency(111);
        person1Account.setNumberAccount(152777);
        person1Account.deposit(200);
        person1Account.withdraw(33);

        person1Account.printDemo();
    }
}

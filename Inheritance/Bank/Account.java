package Bank;


public class Account {

    private Person person;
    private int agency;
    private int numberAccount;
    private int balance;


    public Account(Person person, int agency, int numberAccount, int balance){
        this.person = person;
        this.agency = agency;
        this.numberAccount = numberAccount;
        this.balance = balance;
    }

    public void printDemo(){
        System.out.println("Banco Java");
        System.out.println("Titular: " + getPerson().getName());
        System.out.println("CPF: " + getPerson().getDocument());
        System.out.println("Agência: " + getAgency());
        System.out.println("Número da Conta: " + getNumberAccount());
        System.out.println("Saldo: " + getBalance());
    }

    public void deposit(int value){
        if(value <= 0){
            throw new IllegalArgumentException("O valor a ser depositado, deve ser maior que 0");
        }
        balance += value;
    }

    public void withdraw(int value){
        if(value < 0){
            throw new IllegalArgumentException("O valor do saldo não pode ser NEGATIVO!");
        }

        if(balance < value){
            throw new IllegalArgumentException("O saldo é insuficiente para efetuar essa transação.");
        }

        balance -= value;
    }

    public Person getPerson() {
        return person;
    }


    public int getAgency() {
        return agency;
    }


    public int getNumberAccount() {
        return numberAccount;
    }


    public final int getBalance() {
        return balance;
    }


    public String toString(){
         return String.format("Titular : %s\nNúmero Agência: %d\nNúmero da Conta: %d\nSaldo: %d\n", person, agency, numberAccount, balance);
    }

}


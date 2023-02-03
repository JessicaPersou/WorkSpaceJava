package Bank;


public class Account {

    private Person person;
    private int agency;
    private int numberAccount;
    private double balance;

    public void printDemo(){
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        System.out.println("");
        System.out.println("Banco Java");
        System.out.println("");
        System.out.println("Titular: " + getPerson().getName());
        System.out.println("CPF: " + getPerson().getDocument());
        System.out.println("Agência: " + getAgency());
        System.out.println("Número da Conta: " + getNumberAccount());
        System.out.println("Saldo: " + getBalance());
        System.out.println("");
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
    }

    public void deposit(double value){
        if(value <= 0){
            throw new IllegalArgumentException("O valor a ser depositado, deve ser maior que 0");
        }
        balance += value;
    }

    public void withdraw(double value){
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

    public void setPerson(Person person){
        this.person = person;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getBalance() {
        return balance;
    }


}


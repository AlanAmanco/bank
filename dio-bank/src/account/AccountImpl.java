package account;

import person.Client;

public abstract class AccountImpl implements Account {

    private static final int AGENCY_STANDARD = 1;
    private static int SEQUENTIAL = 1;

    private Client client;
    protected int agency;
    protected int number;
    protected double balance;

    public AccountImpl(Client client){
        this.agency = AGENCY_STANDARD;
        this.number = SEQUENTIAL++;
        this.client = client;
    }

    @Override
    public void withdraw(double value){
        this.balance -= value;
    }

    @Override
    public void deposit(double value){
        this.balance += value;
    }

    @Override
    public void transfer(double value, Account accountTransfer){
        this.withdraw(value);
        accountTransfer.deposit(value);
    }

    public void infStatement(){
        System.out.println(String.format("Agencia: %d",this.agency));
        System.out.println(String.format("Conta: %d",this.number));
        System.out.println(String.format("Saldo: %.2f",this.balance));


    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}

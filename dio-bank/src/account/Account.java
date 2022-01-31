package account;

public interface Account {

    void withdraw(double value);

    void deposit(double value);

    void transfer(double value, Account account);

    public void bankStatement();
}

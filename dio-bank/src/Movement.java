import account.Account;
import account.CheckingAccount;
import account.SavingsAccount;
import person.Client;

public class Movement {

    public static void main (String[] args){

        Client client = new Client();
        client.setName("Alan Amanço");
        client.setCpf("887.584.520-44");
        client.setEmail("alanamanco@gmail.com");

        Account ca = new CheckingAccount(client);
        ca.deposit(100);

        Account sa = new SavingsAccount(client);
        ca.transfer(100,sa);

        ca.bankStatement();
        sa.bankStatement();

    }
}

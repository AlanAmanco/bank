package account;

import person.Client;

public class CheckingAccount extends AccountImpl {

    public CheckingAccount(Client client){
        super(client);
    }

    @Override
    public void bankStatement() {
        System.out.println("==== Extrato Conta Corrente ====");
        super.getClient().infClient();
        super.infStatement();

    }
}

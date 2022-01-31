package account;

import person.Client;

public class SavingsAccount extends AccountImpl{

    public SavingsAccount(Client client){
        super(client);
    }

    @Override
    public void bankStatement(){
        System.out.println("==== Extrato Conta Poupança ====");
        super.getClient().infClient();
        super.infStatement();

    }
}

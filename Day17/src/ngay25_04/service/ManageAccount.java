package ngay25_04.service;

import ngay25_04.model.Account;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManageAccount {
    static List<Account> accounts = new ArrayList<>();
    static IOFile ioFile = new IOFile();
    static {
        try {
            accounts = ioFile.readFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public int getLastAccountId(){
        return accounts.get(accounts.size()-1).getId();
    }
    public Account login(Account account){
        for(Account acc : accounts){
            if(acc.getUsername().equals(account.getUsername()) && acc.getPassword().equals(account.getPassword())){
                return acc;
            }
        }
        return null;
    }
    public void register(Account account) throws IOException {
        accounts.add(account);
        ioFile.writeFile(accounts);
    }
}

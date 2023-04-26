package ngay25_04.service;

import ngay25_04.model.Account;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {

    public void writeFile(List<Account> accounts) throws IOException {
        File f = new File("E:\\.C0223I1\\Module2\\Day17\\src\\ngay25_04\\data\\account.txt");
        FileWriter fileWriter = new FileWriter(f);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for(Account account: accounts){
            bufferedWriter.write(account.toString()+"\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }
    public List<Account> readFile() throws IOException {
        List<Account> accounts = new ArrayList<>();
        File f = new File("E:\\.C0223I1\\Module2\\Day17\\src\\ngay25_04\\data\\account.txt");
        FileReader fileReader = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String c;
        while((c = bufferedReader.readLine()) != null){
            String str[] = c.split(",");
            Account account = new Account(Integer.parseInt(str[0]), str[1], str[2], str[3], str[4], str[5]);
            accounts.add(account);
        }
        bufferedReader.close();
        fileReader.close();
        return accounts;
    }
}

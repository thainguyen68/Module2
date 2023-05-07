package ngay24_04;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOAccount {
    private static void writeFile(List<Account> accounts){
        File f = new File("D:\\Uyen\\TaiLieuDiLam\\C0223I1\\MD1\\MD2\\md2\\src\\ngay24_04\\account.txt");
        try {
            if(!f.exists()){
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f));
            for(Account account : accounts){
                bufferedWriter.write(account.toString() + "\n");
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println("Loi: " + e);
        }


    }
    public static void main(String[] args) throws IOException {
        List<Account> accountList = new ArrayList<>();
        readFile(accountList);
        for (Account a:accountList) {
            System.out.println(a);
           if(a.getName().equals("NguyenNgu")){
               System.out.println("Yes");
           }
        }
    }
    public static void readFile(List<Account> accountList) throws IOException {
        File f=new File("D:\\Uyen\\TaiLieuDiLam\\C0223I1\\MD1\\MD2\\md2\\src\\ngay24_04\\account.txt");
        FileReader fileReader=new FileReader(f);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String c;
        String[] str;
        while ((c=bufferedReader.readLine())!=null){
            str= c.split(", ");
            accountList.add(new Account(Integer.parseInt(str[0]),str[1]));
        }
        bufferedReader.close();
        fileReader.close();
    }
}

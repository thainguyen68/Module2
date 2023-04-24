package Btvn;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<Account> accountList = new ArrayList<>();

        int choice;
        do {
            System.out.println("<--------------Menu--------------->");
            System.out.println("1. Login: ");
            System.out.println("2. Register: ");
            System.out.println("0. Exit: ");
            System.out.println("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        loginAcc(scanner, accountList);
                        break;
                    case 2:
                        createAccount(scanner, accountList);
                        break;
                    case 0:
                        System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.out.println("syntax error!");
            }
        } while (true);

    }

    public static void createAccount(Scanner scanner, List<Account> accountList) {
        int id = 0;
        try {
            System.out.println("Enter id here: ");
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("syntax error!");
        }
        System.out.println("Enter username here: ");
        String user = scanner.nextLine();
        System.out.println("Enter password here: ");
        String pass = scanner.nextLine();
        System.out.println("Enter fullname here: ");
        String fullname = scanner.nextLine();
        int phoneNum = 0;
        try {
            System.out.println("Enter phonme number here: ");
            phoneNum = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("syntax error!");
        }

        System.out.println("Enter address here: ");
        String address = scanner.nextLine();
        Account account = new Account(id, user, pass, fullname, phoneNum, address);
        accountList.add(account);
        writeFile(accountList);
    }

    public static void loginAcc(Scanner scanner, List<Account> accountList) throws IOException {
        readFile(accountList);
        System.out.println("Enter username here: ");
        String user = scanner.nextLine();
        System.out.println("Enter password here: ");
        String pass = scanner.nextLine();
        for (Account c : accountList) {
            if (c.getUsername().equalsIgnoreCase(user) && c.getPassword().equalsIgnoreCase(pass)) {
                System.out.println("Login Success");
            } else {
                System.out.println("Incorrect account or password !");
            }
            break;
        }
    }

    public static void readFile(List<Account> accountList) throws IOException {
        File f = new File("E:\\.C0223I1\\Module2\\Day16\\src\\Btvn\\Account.txt");
        FileReader fileReader = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String c;
        String[] arrNew;
        while ((c = bufferedReader.readLine()) != null) {
            arrNew = c.split(",");
            accountList.add(new Account((Integer.parseInt(arrNew[0])), arrNew[1], arrNew[2], arrNew[3], Integer.parseInt(arrNew[4]), arrNew[5]));
        }
        bufferedReader.close();
        fileReader.close();
    }
    public static void writeFile(List<Account> accountList) {
        File f = new File("E:\\.C0223I1\\Module2\\Day16\\src\\Btvn\\Account.txt");
        try {
            if (!f.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f));
            for (Account account : accountList) {
                bufferedWriter.write(account.toString() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Error " + e);
        }
    }
}

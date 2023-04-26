package ngay25_04.controller;

import ngay25_04.model.Account;
import ngay25_04.service.ManageAccount;

import java.io.IOException;
import java.util.Scanner;

public class MainTest {
    static ManageAccount manageAccount = new ManageAccount();
    public static void login(Scanner scanner){
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        Account result = manageAccount.login(new Account(username, password));
        if(result != null){
            System.out.println("Hello " + result.getFullName());
        }
        else {
            System.out.println("Account does not exist!");
        }
    }
    public static void register(Scanner scanner) throws IOException {
        int id = manageAccount.getLastAccountId()+1;
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        System.out.println("FullName: ");
        String fullName = scanner.nextLine();
        System.out.println("Phone Number: ");
        String phone = scanner.nextLine();
        System.out.println("Address: ");
        String address = scanner.nextLine();
        Account account = new Account(id, username, password, fullName, phone, address);
        manageAccount.register(account);
        System.out.println("Done!");
    }
    public static void main(String[] args) throws IOException {
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("0. Exit");
            System.out.println("Enter choice: ");
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Must enter number!");
            }
            switch (choice) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    register(scanner);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("There is no above command!");

            }
        }while (true);

    }
}

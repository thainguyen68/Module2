import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount USD: ");
        usd = scanner.nextDouble();
        double changeUsd = usd * 23000;
        System.out.println("Amount converted to VND" + changeUsd);
    }
}

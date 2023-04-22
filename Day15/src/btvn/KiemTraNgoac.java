package btvn;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class KiemTraNgoac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        checkBracket(scanner);
    }

    public static void checkBracket(Scanner scanner) {
        ArrayList<String> arrayList = new ArrayList<>();

        while (true) {
            try {
                System.out.println("Nhập số lượng ngoặc: ");
                int num = Integer.parseInt(scanner.nextLine());
                int count = 0;
                for (int i = 0; i < num; i++) {
                    System.out.println("nhập dấu ngoặc vào đây để kiểm tra: ");
                    String bracket = scanner.nextLine();
                    if (bracket.equalsIgnoreCase("(")) {
                        arrayList.add(bracket);
                        count++;
                    } else if (bracket.equalsIgnoreCase(")")) {
                        if (arrayList.isEmpty()) {
                            count--;
                            break;
                        }
                        count--;
                        arrayList.remove("(");
                    } else {
                        System.out.println("Nhập sai mời nhập lại..............>");
                        count--;
                        break;
                    }
                }
                if (count != 0) {
                    System.out.println(false);
                } else {
                    System.out.println(true);
                }
                System.out.println("Mảng hiện tại như sau: " + arrayList);
            } catch (NumberFormatException e) {
                System.out.println("nhập lại.....................>");

            }
        }
    }
}

package LuyenTap;

import java.util.Scanner;

public class MainPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagePhone managePhone = new ManagePhone();
        Contact contact =new Contact();
        int choiceMenu;
        do {
            System.out.println("-----Menu-----");
            System.out.println("Nhập 1 để hiển thị: ");
            System.out.println("Nhập 2 để thêm contact: ");
            choiceMenu = Integer.parseInt(scanner.nextLine());
            switch (choiceMenu) {
                case 1:
                    managePhone.display();
                    break;
                case 2:
                    managePhone.insertPhone(contact);
                    break;
            }
        }
        while (true);
    }
}

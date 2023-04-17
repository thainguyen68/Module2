package miniTest;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HumanManage humanManage = new HumanManage(scanner);

        do {
            System.out.println("MENU");
            System.out.println("1. Create");
            System.out.println("2. Update by id");
            System.out.println("3. Delete by id");
            System.out.println("4. Display by id");
            System.out.println("5. Display all");
            System.out.println("6. Sort by average point");
            System.out.println("7. Sum average point");
            System.out.println("0. Exit");
            System.out.println("Input your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    choiceCreate(scanner, humanManage);
                    break;
                case 2:
                    humanManage.update();
                    break;
                case 3:
                    displayDelete(humanManage);
                    break;
                case 4:
                    displayById(humanManage);
                    break;
                case 5:
                    humanManage.displayAll();
                    break;
                case 6:
                    humanManage.sortByAverage();
                    break;
                case 7:
                    System.out.println("Sum avg is: " + humanManage.sumAverage());
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    private static void displayById(HumanManage humanManage) {
        Human h = humanManage.getById();
        if (h != null) {
            System.out.println("Object is:");
            h.display();
        }
    }

    private static void displayDelete(HumanManage humanManage) {
        Human human = humanManage.deleteById();
        if (human != null) {
            System.out.println("Object deleted is:");
            human.display();
        }
    }

    private static void choiceCreate(Scanner scanner, HumanManage humanManage) {
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Human");
            System.out.println("2. Student");
            System.out.println("0. Exit");
            System.out.println("Input your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    humanManage.create();
                    break;
                case 2:
                    humanManage.createStudent();
                    break;
            }
        }while (choice != 0);
    }
}

import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageColor manageColor = new ManageColor(scanner);
        ManageProduct manageProduct = new ManageProduct(scanner,manageColor);
        ManageCart manageCart =new ManageCart(manageProduct);

        int choice = -1;
        do {
            System.out.println("Menu");
            System.out.println("1. Display all products");
            System.out.println("2. Create products");
            System.out.println("3. Update products");
            System.out.println("4. Delete products");
            System.out.println("5. Find products by name");
            System.out.println("6. Find products by id");
            System.out.println("7. Sort products by price");
            System.out.println("8. Menu color");
            System.out.println("9. Menu Cart(...)");
            System.out.println("0. Exit!");
            System.out.println("-->Enter your choice here!<--");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Please re-enter the number!");
            }

            switch (choice) {
                case 1:
                    manageProduct.displayAll();
                    break;
                case 2:
                    manageProduct.create();
                    break;
                case 3:
                    manageProduct.update();
                    break;
                case 4:
                    manageProduct.delete();
                    break;
                case 5:
                    manageProduct.searchByName();
                    break;
                case 6:
                    manageProduct.searchById();
                    break;
                case 7:
                    manageProduct.sortByName();
                    break;
                case 8:
                    menuColor(scanner,manageColor);
                    break;
                case 9:
                    menuCart(scanner,manageCart);
                    break;
            }
        } while (choice != 0);
    }

    private static void menuColor(Scanner scanner, ManageColor manageColor){
        int choice = -1;
        do {
            System.out.println("Menu");
            System.out.println("1. Display all color");
            System.out.println("2. Create color");
            System.out.println("3. Update color");
            System.out.println("4. Delete color");
            System.out.println("0. Exit!");
            System.out.println("-->Enter your choice here!<--");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Please re-enter the number!");
            }

            switch (choice) {
                case 1:
                    manageColor.displayAll();
                    break;
                case 2:
                    manageColor.create();
                    break;
                case 3:
                    manageColor.update();
                    break;
                case 4:
                    manageColor.delete();
                    break;
            }
        } while (choice != 0);
    }

    public static void  menuCart(Scanner scanner, ManageCart manageCart){
        int choice = -1;
        do {
            System.out.println("Menu");
            System.out.println("1. Display cart");
            System.out.println("2. Add to cart");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("0. Exit!");
            System.out.println("-->Enter your choice here!<--");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please re-enter the number!");
            }

            switch (choice) {
                case 1:
                    manageCart.displayCart();
                    break;
                case 2:
                    manageCart.shopping();
                    break;
            }
        } while (choice != 0);
    }
}

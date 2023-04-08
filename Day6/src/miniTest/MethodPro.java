package miniTest;

import java.util.Scanner;

public class MethodPro {
    static Scanner scanner = new Scanner(System.in);

    //Get Product
    public static Product getProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã: ");
        int id = scanner.nextInt();
        System.out.println("Nhập tên: ");
        String name = scanner.next();
        System.out.println("Nhập giá: ");
        double price = scanner.nextDouble();
        System.out.println("Nhập loại: ");
        String type = scanner.next();
        return new Product(id, name, price, type);
    }

    //display Product:
    public static void displayPro(Product[]products) {
        for (int j = 0; j < products.length; j++) {
            System.out.println(products[j]);
        }
    }


    //Search Product:
    public static void search(Product[] products) {
        System.out.println("Nhập tên sản phẩm cần tìm:");
        String name = scanner.next();
        Boolean check = false;
        for (int i = 0; i < products.length; i++) {
            if (name.equals(products[i].getName())) {
                check = true;
                System.out.println(products[i]);
            }
        }
        if (check == false) {
            System.out.println("Không tìm thấy...");
        }
    }


    //Total Price Of Product:
    public static void sumPriceAllProduct(Product[] products) {
        int sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice();
        }
        System.out.println("Tổng tiền của các sản phẩm: " + sum + " " + Product.getUSD());
    }

    //Edit Product:
    public static void EditProduct(Product[] products) {
        System.out.println("Nhập id muốn sửa: ");
        int index = scanner.nextInt();
        for (int i = 0; i < products.length; i++) {
            if (index == products[i].getId()) {
                products[i] = MethodPro.getProduct();
                index=i;
            }
        }
        System.out.println(products[index].toString());
    }

}

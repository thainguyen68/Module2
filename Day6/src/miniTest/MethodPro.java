package miniTest;

import java.util.Scanner;

public class MethodPro {
    static Scanner scanner = new Scanner(System.in);

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
        if (check==false) {
            System.out.println("Không tìm thấy...");
        }
    }


    //Total Price Of Product:
    public static void sumPriceAllProduct(Product[]products) {
        int sum=0;
        for (int i = 0; i <products.length ; i++) {
            sum += products[i].getPrice();
        }
        System.out.println("Tổng tiền của các sản phẩm: "+sum + " " +Product.getUSD());
    }
}

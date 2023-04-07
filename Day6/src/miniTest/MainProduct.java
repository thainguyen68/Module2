package miniTest;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng sản phẩm: ");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        Product[] products = new Product[num];
        for (int i = 0; i < products.length ; i++) {
            products[i]= Product.getProduct();
        }

        //display Product:
        for (int j = 0; j < products.length ; j++) {
            System.out.println(products[j]);
        }


        //search:
        System.out.println("Nhập tên sản phẩm bất kỳ:");
        String name = scanner.next();
        Boolean check = false;
        for (int i = 0; i <products.length ; i++) {
            if (name.equals(products[i].getName())) {
                check = true;
                System.out.println(products[i]);
            }
        }
            if (check = false) {
                System.out.println("Không tìm thấy...");
            }



        //sumAllProduct:
        int sum=0;
        for (int i = 0; i <products.length ; i++) {
            sum += products[i].getPrice();
        }
        System.out.println("Tổng tiền của các sản phẩm: "+sum + " " +Product.getUSD());


    }
}

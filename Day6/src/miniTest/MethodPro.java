package miniTest;

import java.util.Scanner;

public class MethodPro {
    static Scanner scanner = new Scanner(System.in);



//create Product:
//    public static void createProducts(Scanner scanner, Product[] products) {
//        for (int i = 0; i < products.length; i++) {
//            products[i] = getProduct(scanner, i);
//        }
//    }
//
//


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
    public static void displayPro(Product[] products) {
        for (Product p : products) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }





    //Search Product:
    //cách 1:
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

    //cách 2
//    public static Product search(Scanner scanner, Product[] products) {
//        System.out.println("Nhập vào tên sản phẩm bạn muốn tìm: ");
//        String nameSearch = scanner.nextLine();
//        for (Product p : products) {
//            if (p.getName().equalsIgnoreCase(nameSearch)) {
//                return p;
//            }
//        }
//        return null;
//    }

    //cách 3
//    public static Product[] search(Scanner scanner, Product[] products) {
//        System.out.println("Nhập vào tên sản phẩm bạn muốn tìm: ");
//        String nameSearch = scanner.nextLine();
//        Product[] productSearch = new Product[products.length];
//        int index = 0;
//        for (Product p : products) {
//            if (p.getName().contains(nameSearch)) {
//                productSearch[index] = p;
//                index++;
//            }
//        }
//        return productSearch;
//    }






    //Total Price Of Product:
    // cách 1:
    public static void sumPriceAllProduct(Product[] products) {
        int sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice();
        }
        System.out.println("Tổng tiền của các sản phẩm: " + sum + " " + Product.getUSD());
    }


    // cách 2:
//    public static double sumPriceAllProduct(Product[] products) {
//        double sum = 0;
//        for (Product p : products) {
//            sum += p.getPrice();
//        }
//        return sum;
//    }





    //Edit Product:
    public static void editProduct(Product[] products) {
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



    //Delete Product:
    public static void deleteProduct(Product[] products) {
        System.out.println("Nhập tên sản phẩm cần xóa vào đây: ");
        String deleteName = scanner.next();
        Product[] products1 = new Product[products.length-1];
        int j =0;

        for (int i = 0; i < products.length ; i++) {
            if (!deleteName.equals(products[i].getName()) ){
                products1[j] = products[i];
                j++;
            }
        }
        for (int i = 0; i < products1.length; i++) {
            System.out.println("Các phần tử của mảng là");
            System.out.println(products1[i].toString());
        }
    }


}

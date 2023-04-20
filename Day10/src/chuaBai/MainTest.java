package bai10;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainTest {
    public static void main(String[] args) {
        Product str1 = new Product("A");
        Product str2 = new Product("B");
        Product str3 = new Product("C");
        Product str4 = new Product("D");
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Product> products2 = new ArrayList<>();
        LinkedList<Product> products1 = new LinkedList<>();
        products.add(str1);
        products.add(str2);
        products1.add(str3);
        products1.add(str4);
        System.out.println(products);
        System.out.println(products1);
        products.get(0).setName("ABC");
        System.out.println(str1.getName());

        System.out.println("Hello: " + products2.size());

        for (Product p : products) {
            System.out.println(p);
        }

        for (Product p : products1) {
            System.out.println(p);
        }
    }
}

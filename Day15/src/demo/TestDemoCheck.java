package demo;

import java.util.Scanner;

public class TestDemoCheck {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int age;
        try {
            System.out.println("Enter your age: ");
            age = Integer.parseInt(scanner.nextLine());
            DemoCheck demoCheck = new DemoCheck(age);
        } catch (InnerDemoCheck e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("re-enter your age: ");
        }finally {
            System.out.println("End!!!");
        }
    }
}

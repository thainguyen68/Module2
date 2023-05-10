package Demo;

import java.io.*;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
       int choice;
        do {
            System.out.println("<---------Menu---------->");
            System.out.println("1. Convert object to stream");
            System.out.println("2.Convert stream to object");
            System.out.println("0. Exit: ");
            System.out.println("Enter your choice: ");
            try{
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        serialization();
                        break;
                    case 2:
                        deserialization();
                        break;
                    case 0:
                        System.exit(0);
                }
            }catch (NumberFormatException e){
                System.err.println("Error");
            }

       }while (true);
    }


    public static void serialization() {
        ObjDemo objDemo = new ObjDemo("Alice", 25,"male");
        ObjDemo1 objDemo1 = new ObjDemo1("Tahi",23,"Male",123);
        try{
            //Tạo luồng byte và ghi đối tượng vào tệp
            FileOutputStream file = new FileOutputStream("E:\\.C0223I1\\Module2\\Day17\\src\\Demo\\objDemo.txt");
            //Sử dụng ObjectOutputStream để ghi đối tượng vào một file hoặc stream.
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(objDemo);
            output.writeObject(objDemo1);
            output.close();
        } catch (IOException e){
            System.err.println("Error!!!");
        }
    }

    public static void deserialization() throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("E:\\.C0223I1\\Module2\\Day17\\src\\Demo\\objDemo.txt");
        ObjectInputStream input = new ObjectInputStream(file);
        ObjDemo objDemo = (ObjDemo) input.readObject();
        ObjDemo1 objDemo1 = (ObjDemo1) input.readObject();
        input.close();
        System.out.println(objDemo);
        System.out.println(objDemo1);
    }

    static public void abc(){}
}

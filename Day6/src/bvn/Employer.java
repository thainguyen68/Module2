package bvn;

import java.util.Scanner;

public class Employer {
    int id;
    String name;
    int age;

    public Employer() {
    }

    public Employer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    static Scanner scanner = new Scanner(System.in);
    public static Employer getEmployer() {
        System.out.println("Nhập id nhân viên: ");
        int id = scanner.nextInt();
        System.out.println("Nhập tên nhân viên: ");
        String name= scanner.next();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        return new Employer(id,name,age);
    }



}

package bvn.Model;

import java.util.Scanner;

public class Employer {
    int id;
    private static int idSum =1 ;
    String name;
    int age;

    public Employer() {
        idSum++;
    }

    public Employer( String name, int age) {
        this.id = idSum++;
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

}

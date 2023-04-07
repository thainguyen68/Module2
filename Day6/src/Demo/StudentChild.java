package Demo;

import java.util.Scanner;

public class StudentChild extends Student {
    String add = "Hà Nội";


    public StudentChild(String name, int age, String add) {
        super(name, age);
        this.add = add;
    }

    public StudentChild() {
    }

    @Override
    public String toString() {
        return "StudentChild{" + super.toString() +
                ", add='" + add + '\'' +
                '}';
    }




}

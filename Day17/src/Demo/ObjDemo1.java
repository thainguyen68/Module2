package Demo;

import java.io.Serializable;

public class ObjDemo1 extends ObjDemo {
    private static final long serialVersionUID = 2L;
    private String name;
    private int age;
    private String gender;
    private int num;

    public ObjDemo1() {
    }

    public ObjDemo1(String name, int age, String gender, int num) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public ObjDemo1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return
                 name + "," + age + "," + gender ;
    }
}

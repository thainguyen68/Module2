package Demo;

import java.io.Serializable;

public class ObjDemo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String gender;

    public ObjDemo() {
    }

    public ObjDemo(String name, int age, String gender) {
        this.name = name;
        this.age = age;
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

    public ObjDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return
                 name + "," + age + "," + gender ;
    }
}

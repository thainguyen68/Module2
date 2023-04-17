package miniTest;

public class Human {
    private static int INDEX = 0;
    private final int id;
    private String name;
    private int age;

    public Human(String name, int age) {
        this.id = ++INDEX;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
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

    public void display() {
        System.out.printf("%-5s%-15s%s", id, name, age +"\n");
    }
}

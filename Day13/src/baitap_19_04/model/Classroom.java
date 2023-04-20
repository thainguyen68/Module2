package baitap_19_04.model;

public class Classroom {
    private static int INDEX = 0;
    private final int id;
    private String name;

    public Classroom(String name) {
        this.id = ++INDEX;
        this.name = name;
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

    public void display() {
        System.out.printf("%-10s%s", this.id, this.name + "\n");
    }
}

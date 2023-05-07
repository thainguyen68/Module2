package chua_baitap_19_04.model;

import java.io.Serializable;

public class Classroom implements Serializable {
    private static final long serialVersionUID = 1234567898654321L;
    public static int INDEX;
    private final int id;
    private String name;

    public Classroom(String name) {
        this.id = ++INDEX;
        this.name = name;
    }

    public Classroom(int id, String name) {
        this.id = id;
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

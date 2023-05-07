package chua_baitap_19_04.model;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1234567898654321L;
    public static int INDEX;
    private final int id;
    private String name;
    private int age;
    private String gender;
    private double avg;

    private Classroom classroom;

    public Student(String name, int age, String gender, double avg, Classroom classroom) {
        this.id = ++INDEX;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.avg = avg;
        this.classroom = classroom;
    }

    public Student(int id, String name, int age, String gender, double avg, Classroom classroom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.avg = avg;
        this.classroom = classroom;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public void display() {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%s",
                this.id, this.name, this.age, this.gender,
                this.avg, this.classroom.getName() + "\n");
    }
}

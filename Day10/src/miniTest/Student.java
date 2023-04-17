package miniTest;

public class Student extends Human{
    private double averagePoint;

    public Student(String name, int age, double averagePoint) {
        super(name, age);
        this.averagePoint = averagePoint;
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

    public void display() {
        System.out.printf("%-5s%-15s%-7s%s",
                super.getId(), super.getName(), super.getAge(), averagePoint +"\n");
    }
}

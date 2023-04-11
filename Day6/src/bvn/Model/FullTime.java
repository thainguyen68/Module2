package bvn.Model;

public class FullTime extends Employer {
    int yearOfExp ;

    public FullTime(int yearOfExp) {
        this.yearOfExp = yearOfExp;
    }

    public FullTime() {
    }

    public FullTime(int id, String name, int age, int yearOfExp) {
        super(id, name, age);
        this.yearOfExp = yearOfExp;
    }

    public int getYearOfExp() {
        return yearOfExp;
    }

    public void setYearOfExp(int yearOfExp) {
        this.yearOfExp = yearOfExp;
    }

    @Override
    public String toString() {
        return "FullTime{" +
                "yearOfExp=" + yearOfExp +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

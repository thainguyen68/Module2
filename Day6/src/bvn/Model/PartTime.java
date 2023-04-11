package bvn.Model;

public class PartTime extends Employer {
    int workTime ;

    public PartTime() {
    }

    public PartTime( String name, int age, int workTime) {
        super( name, age);
        this.workTime = workTime;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public String toString() {
        return "PartTime{" +
                "workTime=" + workTime +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

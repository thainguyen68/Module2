package demo;

public class DemoCheck {
    private int age;

    public DemoCheck(int age) throws InnerDemoCheck {
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InnerDemoCheck {
        if (age < 18){
            throw new InnerDemoCheck("age should be greater than or equal to 18! ");
        }else {
            this.age = age;
            System.out.println("Congratulations you are old enough to do this...");
        }
    }
}

package Demo;

public abstract class winged extends Animal implements Fly,CantFly{
    String name;

    public winged() {
    }

    public String getName() {
        return name;
    }

    @Override
    public void CantFly() {

    }

    @Override
    public void CanFly() {
        System.out.println("có bay đc");
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void HaveWing();

}

package Demo;

public class Bird extends Animal implements Winged{

    @Override
    public void Hello() {
        System.out.println("Chào mọi người tôi là chim");
    }

    @Override
    public void HaveWing() {
        System.out.println("tôi có cánh này");
    }
}

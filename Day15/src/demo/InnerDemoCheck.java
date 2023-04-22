package demo;

public class InnerDemoCheck extends Exception{
    private String message;

    public InnerDemoCheck(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

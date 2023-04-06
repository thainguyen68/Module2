package BaiTap.Fan;

public class Fan {
   //khởi tạo
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;


    //getter + setter
    public int getSlow() {
        return slow;
    }
    public void setSlow(int slow) {
        this.slow = slow;
    }

    public int getMedium() {
        return medium;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    public int getFast() {
        return fast;
    }

    public void setFast(int fast) {
        this.fast = fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Constructor khởi tạo đối tượng không tham số
    public Fan() {
        this.speed = slow;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    // toString() trả về chuỗi chứa thông tin của Fan
    public String display() {
        return "Fan :" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color=" + color;
    }
}

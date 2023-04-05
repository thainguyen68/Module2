package BaiTap.Fan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setOn(true);
        fan.setSpeed(fan.fast);
        fan.setRadius(10.0);
        System.out.println(fan.display());
    }
}

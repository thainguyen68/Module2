package bvn;

import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nhân viên: ");
        int num = scanner.nextInt();
        Employer[] employers = new Employer[num];


        for (int i = 0; i < employers.length ; i++) {
            if (employers[i] instanceof FullTime) {
                FullTime human = (FullTime) employers[i];
                System.out.println(human.getYearOfExp()*2000000);
            }
            else {
                PartTime human = (PartTime) employers[i];
                System.out.println(human.getWorkTime()*25000);
            }
        }
    }
}

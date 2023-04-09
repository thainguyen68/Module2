package bvn;

import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nhân viên: ");
        int num = scanner.nextInt();
        Employer[] employers = new Employer[num];


        for (int i = 0; i < employers.length; i++) {
            for (int j = 0; j < employers.length ; j++) {
//                Employer[] fullTimes = Employer.getEmployer();
                Employer partTimes = PartTime.getEmployer();
            }
//
        }


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

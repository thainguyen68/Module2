package btvn;

import java.util.Scanner;

public class Student {
    private String ten;
    private int tuoi;
    int toan, ly, hoa;

    static Scanner scanner = new Scanner(System.in);

    public Student(String ten, int tuoi, int toan, int ly, int hoa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public Student(){}



    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getToan() {
        return toan;
    }

    public void setToan(int toan) {
        this.toan = toan;
    }

    public int getLy() {
        return ly;
    }

    public void setLy(int ly) {
        this.ly = ly;
    }

    public int getHoa() {
        return hoa;
    }

    public void setHoa(int hoa) {
        this.hoa = hoa;
    }


    @Override
    public String toString() {
        return "Student{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", toan=" + toan +
                ", ly=" + ly +
                ", hoa=" + hoa +
                '}';
    }



    public static Student student() {
        System.out.println("nhập tên: ");
        String ten = scanner.next();

        System.out.println("nhập tuổi: ");
        int tuoi = scanner.nextInt();
        System.out.println("nhập điểm toán: ");
        int toan = scanner.nextInt();
        System.out.println("nhập điểm ly: ");
        int ly = scanner.nextInt();
        System.out.println("nhập điểm hoá: ");
        int hoa = scanner.nextInt();
        return new Student(ten,tuoi,toan,ly,hoa);
    }

    public double avg () {
        return ((ly+toan+hoa)/3);
    }
}

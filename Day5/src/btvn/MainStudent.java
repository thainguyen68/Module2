package btvn;

import java.util.Scanner;

public class MainStudent {

    public static void main(String[] args) {
//        Student student = new Student();
//        Student student1 = new Student();
//        Student student2 = new Student();
//        Student[] students = {student,student1,student2};
        System.out.println("Nhập số học sinh");
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();
        Student[] students = new Student[num];

//        for (int i = 0; i < students.length; i++) {
//            students[i] = Student.student();
//            System.out.println(students[i]);
//        }


        for (int i = 0; i <students.length; i++) {
            students[i]=new Student();
            System.out.println("Nhap vao ten: " + (i + 1));
            String ten = scanner.nextLine();
            scanner.nextLine();
            students[i].setTen(ten);
            System.out.println("Nhap vao tuoi: " + (i + 1));
            int tuoi = scanner.nextInt();
            students[i].setTuoi(tuoi);
            System.out.println("Nhap vao diem lý: " + (i + 1));
            int ly = scanner.nextInt();
            students[i].setLy(ly);
            System.out.println("Nhap vao diem toan: " + (i + 1));
            int toan = scanner.nextInt();
            students[i].setToan(toan);
            System.out.println("Nhap vao diem hoa: " + (i + 1));
            int hoa = scanner.nextInt();
            students[i].setHoa(hoa);
        }





        double max = (students[0].getToan()+ students[0].getHoa()+ students[0].getLy())/3;
        int index=0;

        for (int i = 0; i < students.length; i++) {
            if ((students[i].getToan()+ students[i].getHoa()+ students[i].getLy())/3 > max){
                    index =i;
                    max = (students[i].getToan()+ students[i].getHoa()+ students[i].getLy())/3;
            }
        }
        System.out.println(students[index]);
        System.out.println("Điểm TB cao nhất là: " + max);
    }


    public static void Nhapten() {

    }

}

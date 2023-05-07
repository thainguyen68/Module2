package chua_baitap_19_04.controller;

import chua_baitap_19_04.model.Classroom;
import chua_baitap_19_04.model.Student;
import chua_baitap_19_04.service.impl.ClassroomManage;
import chua_baitap_19_04.service.impl.StudentManage;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassroomManage classroomManage = new ClassroomManage(scanner);
        StudentManage studentManage = new StudentManage(classroomManage, scanner);
        superMenu(studentManage, scanner);
    }

    private static void superMenu(StudentManage studentManage, Scanner scanner) {
        do {
            System.out.println("MENU");
            System.out.println("1. Create new Student");
            System.out.println("2. Update Student by id");
            System.out.println("3. Delete Student by id");
            System.out.println("4. Display Student by id");
            System.out.println("5. Display all Student");
            System.out.println("6. Display all Student by min point");
            System.out.println("7. Display all Student by max point");
            System.out.println("8. Display all Student by rank");
            System.out.println("9. Display all Student by gender");
            System.out.println("10. Display all Student by Classroom");
            System.out.println("11. Action with Classroom");
            System.out.println("0. Exit");
            System.out.println("Input your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Student studentCreate = studentManage.create();
                    System.out.println("Student created is: ");
                    studentManage.displayOne(studentCreate);
                    break;

                case 2:
                    Student studentUpdate = studentManage.update();
                    System.out.println("Student updated is: ");
                    studentManage.displayOne(studentUpdate);
                    break;

                case 3:
                    Student studentDelete = studentManage.delete();
                    System.out.println("Student deleted is: ");
                    studentManage.displayOne(studentDelete);
                    break;

                case 4:
                    Student student = studentManage.getById();
                    System.out.println("Student is: ");
                    studentManage.displayOne(student);
                    break;
                case 5:
                    studentManage.displayAll();
                    break;
                case 6:
                    studentManage.displayStudentMinPoint();
                    break;
                case 7:
                    studentManage.displayStudentMaxPoint();
                    break;
                case 8:
                    studentManage.displayStudentByRank();
                    break;
                case 9:
                    studentManage.displayStudentByGender();
                    break;
                case 10:
                    studentManage.displayByClassroom();
                    break;
                case 11:
                    subMenu(studentManage, scanner);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    private static void subMenu(StudentManage studentManage,
                                Scanner scanner) {
        int choice;
        do {

            System.out.println("MENU");
            System.out.println("1. Create new Classroom");
            System.out.println("2. Update Classroom by id");
            System.out.println("3. Delete Classroom by id");
            System.out.println("4. Display Classroom by id");
            System.out.println("5. Display all Classroom");
            System.out.println("0. Exit");
            System.out.println("Input your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Classroom classroomCreate = studentManage.getClassroomManage().create();
                    System.out.println("Classroom created is: ");
                    studentManage.getClassroomManage().displayOne(classroomCreate);
                    break;
                case 2:
                    Classroom classroomUpdate = studentManage.getClassroomManage().update();
                    System.out.println("Classroom updated is: ");
                    studentManage.getClassroomManage().displayOne(classroomUpdate);
                    break;
                case 3:
                    Classroom classroomDelete = studentManage.getClassroomManage().delete();
                    studentManage.deleteByClassroom(classroomDelete);
                    System.out.println("Classroom deleted is: ");
                    studentManage.getClassroomManage().displayOne(classroomDelete);
                    break;
                case 4:
                    Classroom classroom = studentManage.getClassroomManage().getById();
                    System.out.println("Classroom is: ");
                    studentManage.getClassroomManage().displayOne(classroom);
                    break;
                case 5:
                    studentManage.getClassroomManage().displayAll();
                    break;
            }
        } while (choice != 0);
    }
}

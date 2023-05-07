package chua_baitap_19_04.service.impl;

import chua_baitap_19_04.io.IOFile;
import chua_baitap_19_04.model.Classroom;
import chua_baitap_19_04.model.Student;
import chua_baitap_19_04.service.Manage;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentManage implements Manage<Student>, IOFile<Student> {

    private final Scanner scanner;
    private final ArrayList<Student> students;
    private final ClassroomManage classroomManage;
    private final String PATH_FILE = "C:\\Users\\ADMIN\\Desktop\\Module_C0223\\src\\minitest\\baitap_19_04\\data\\student.txt";

    public StudentManage(ClassroomManage classroomManage, Scanner scanner) {
        this.scanner = scanner;
        this.classroomManage = classroomManage;
        students = read(PATH_FILE);
        checkDefaultIndex();
    }

    private void checkDefaultIndex() {
        if (students.isEmpty()) {
            Student.INDEX = 0;
        } else {
            Student.INDEX = students.get(students.size() - 1).getId();
        }
    }

    public ClassroomManage getClassroomManage() {
        return classroomManage;
    }

    @Override
    public Student create() {
        //đếm số lần nhập
        int count = 0;
        //nhập tên
        System.out.println("Input name student: ");
        String name = scanner.nextLine();
        //nhập tuổi có điều kiện
        Integer age = getAge(count);
        if (age == null) return null;
        //nhập giới tính có điều kiện
        String gender = getGender(count);
        if (gender == null) return null;
        //nhập điểm có điều kiện
        Double avg = getAvgPoint(count);
        if (avg == null) return null;
        //nhập Classroom có điều kiện
        Classroom classroom = getClassroom();
        Student student = new Student(name, age, gender, avg, classroom);
        students.add(student);
        write(students, PATH_FILE);
        return student;
    }

    private Classroom getClassroom() {
        System.out.println("Input classroom of student: ");
        Classroom classroom;
        do {
            classroom = classroomManage.getById();
        } while (classroom == null);
        return classroom;
    }


    private Double getAvgPoint(int count) {
        System.out.println("Input avg student: ");
        double avg = -1;
        do {
            count++;
            try {
                avg = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
            }
            if (count == 4) {
                return null;
            } else if (avg < 0 || avg > 10) {
                System.out.println("Please re-input: ");
            }
        } while ((avg < 0 || avg > 10));
        return avg;
    }

    private String getGender(int count) {
        System.out.println("Input gender student: ");
        String gender;
        do {
            gender = getGender();
            count++;
            if (count == 4) {
                return null;
            }
        } while (gender.equals(""));
        return gender;
    }

    private Integer getAge(int count) {
        System.out.println("Input age student: ");
        int age;
        do {
            age = Integer.parseInt(scanner.nextLine());
            count++;
            if (count == 4) {
                return null;
            } else if (age < 0 || age > 60) {
                System.out.println("Please re-input: ");
            }
        } while ((age < 0 || age > 60));
        return age;
    }

    private String getGender() {
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.println("3. Other");
        System.out.println("Input your choice: ");
        String c = scanner.nextLine();
        if (c.equals("")) {
            return "Not change";
        } else {
            int choice = Integer.parseInt(c);
            switch (choice) {
                case 1:
                    return "Male";
                case 2:
                    return "Female";
                case 3:
                    return "Other";
            }
            return "";
        }
    }


    @Override
    public Student update() {
        Student student = getById();
        if (student != null) {
            System.out.println("Input new name student: ");
            String name = scanner.nextLine();
            if (!name.equals("")) {
                student.setName(name);
            }
            System.out.println("Input new age student: ");
            String age = scanner.nextLine();
            if (!age.equals("")) {
                student.setAge(Integer.parseInt(age));
            }
            System.out.println("Input new gender student: ");
            String gender;
            do {
                gender = getGender();
                if (!gender.equals("") && !gender.equals("Not change")) {
                    student.setGender(gender);
                }
            } while (gender.equals(""));
            System.out.println("Input new avg student: ");
            String avg = scanner.nextLine();
            if (!avg.equals("")) {
                student.setAvg(Double.parseDouble(avg));
            }
            System.out.println("Input new classroom of student: ");
            Classroom classroom = getClassroom();
            if (classroom != null) {
                student.setClassroom(classroom);
            }
        }
        write(students, PATH_FILE);
        return student;
    }

    @Override
    public Student delete() {
        Student student = getById();
        if (student != null) {
            students.remove(student);
        }
        write(students, PATH_FILE);
        return student;
    }

    @Override
    public Student getById() {
        displayAll();
        System.out.println("Input id you want to find: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void displayAll() {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%s",
                "ID", "NAME", "AGE", "GENDER", "AVG", "CLASSROOM\n");
        for (Student student : students) {
            student.display();
        }
    }

    public void deleteByClassroom(Classroom classroom) {
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            if (studentIterator.next().getClassroom().equals(classroom)) {
                studentIterator.remove();
            }
        }
    }

    public void displayOne(Student student) {
        if (student != null) {
            student.display();
        } else {
            System.out.println("Not exist this object!");
        }
    }

    public void displayByClassroom() {
        classroomManage.displayAll();
        System.out.println("Input id you want to choice: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%s",
                "ID", "NAME", "AGE", "GENDER", "AVG", "CLASSROOM\n");
        for (Student student : students) {
            if (student.getClassroom().getId() == id) {
                displayOne(student);
            }
        }
    }

    public void displayStudentMinPoint() {
        System.out.println("Display by min point is: ");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%s",
                "ID", "NAME", "AGE", "GENDER", "AVG", "CLASSROOM\n");
        double min = students.get(0).getAvg();
        for (Student student : students) {
            if (student.getAvg() < min) {
                min = student.getAvg();
            }
        }

        for (Student student : students) {
            if (student.getAvg() == min) {
                displayOne(student);
            }
        }
    }

    public void displayStudentMaxPoint() {
        System.out.println("Display by max point is: ");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%s",
                "ID", "NAME", "AGE", "GENDER", "AVG", "CLASSROOM\n");
        double max = students.get(0).getAvg();
        for (Student student : students) {
            if (student.getAvg() > max) {
                max = student.getAvg();
            }
        }

        for (Student student : students) {
            if (student.getAvg() == max) {
                displayOne(student);
            }
        }
    }

    public void displayStudentByRank() {
        System.out.println("Display by rank is: ");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-15s%s",
                "ID", "NAME", "AGE", "GENDER", "AVG", "CLASSROOM", "RANKED\n");
        for (Student student : students) {
            if (student.getAvg() > 8) {
                displayInMethodByRank(student, "BEST");
            } else if (student.getAvg() > 6) {
                displayInMethodByRank(student, "GOOD");
            } else if (student.getAvg() > 4.5) {
                displayInMethodByRank(student, "NORMAL");
            } else {
                displayInMethodByRank(student, "POOR");
            }
        }
    }

    private void displayInMethodByRank(Student student, String rank) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-15s%s",
                student.getId(), student.getName(), student.getAge(),
                student.getGender(), student.getAvg(),
                student.getClassroom().getName(), rank + "\n");
    }

    public void displayStudentByGender() {
        System.out.println("Display by gender is: ");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.println("3. Other");
        System.out.println("Input your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%s",
                "ID", "NAME", "AGE", "GENDER", "AVG", "CLASSROOM\n");
        switch (choice) {
            case 1:
                for (Student student : students) {
                    if (student.getGender().equals("Male")) {
                        displayOne(student);
                    }
                }
                break;
            case 2:
                for (Student student : students) {
                    if (student.getGender().equals("Female")) {
                        displayOne(student);
                    }
                }
                break;
            case 3:
                for (Student student : students) {
                    if (student.getGender().equals("Other")) {
                        displayOne(student);
                    }
                }
                break;
        }
    }

    @Override
    public void write(List<Student> e, String path) {
        File file = new File(path);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (Student student : e) {
                bufferedWriter.write(student.getId() + "," + student.getName() + ","
                        + student.getAge() + "," + student.getGender() + ","
                        + student.getAvg() + "," + student.getClassroom().getId() + "\n");
            }
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }

    @Override
    public ArrayList<Student> read(String path) {
        File file = new File(path);
        ArrayList<Student> students = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                String[] strings = data.split(",");
                students.add(new Student(Integer.parseInt(strings[0]), strings[1],
                        Integer.parseInt(strings[2]), strings[3],
                        Double.parseDouble(strings[4]),
                        classroomManage.getById(Integer.parseInt(strings[5]))));
            }
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
        return students;
    }

    @Override
    public void writeBinary(List<Student> e, String path) {

    }

    @Override
    public ArrayList<Student> readBinary(String path) {
        return null;
    }
}

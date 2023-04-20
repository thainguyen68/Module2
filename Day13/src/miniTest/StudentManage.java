package miniTest;


import java.util.*;
import java.util.Comparator;

public class StudentManage implements Manage {
    static ArrayList<Student> arrayList = new ArrayList<>();
    static Map<Integer, String> gender = new TreeMap<>();
    Set<Integer> k = gender.keySet();
     ClassroomManage classroomManage = new ClassroomManage();


    public StudentManage() {
        gender.put(1, "Nam");
        gender.put(2, "Nữ");
        gender.put(0, "Other");

        Student student = new Student("Thai", 23, "Nam", 6.8, new Classroom(1, "12a"));
        arrayList.add(student);
        Student student1 = new Student("Nguyen", 68, "Nam", 1.1, new Classroom(2, "12b"));
        arrayList.add(student1);
        Student student3 = new Student("Huyen", 22, "Nu", 9.9, new Classroom(1, "12a"));
        arrayList.add(student3);
    }


    public void displayGener() {
        for (Integer g : k) {
            System.out.println(g + " - " + gender.get(g));
        }
    }

    public void displayClassroom() {
        for (Classroom c : classroomManage.classrooms) {
            System.out.println(c);
        }
    }

    @Override
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên hs:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi hs: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("chọn giới tính: ");
        displayGener();
        int choice1 = Integer.parseInt(scanner.nextLine());
        String str = "";
        for (Integer key : k) {
            if (choice1 == key) {
                str = gender.get(key);
            }
        }
        System.out.println("nhập điểm trung bình");
        double avgPoint = Double.parseDouble(scanner.nextLine());
        displayClassroom();
        System.out.println("Nhập lớp: ");
        int choice2 = Integer.parseInt(scanner.nextLine());
        Classroom str1 = new Classroom();
        for (int i = 0; i < classroomManage.classrooms.size(); i++) {
            if (choice2 == classroomManage.classrooms.get(i).getId()) {
                str1 = classroomManage.classrooms.get(i);
            }
        }

        Student student = new Student(name, age, str, avgPoint, str1);
        arrayList.add(student);
    }

    @Override
    public void editStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id muốn sửa: ");
        int idDelete = Integer.parseInt(scanner.nextLine());

        for (Student p : arrayList) {
            if (idDelete == p.getId()) {
                System.out.println("tên mới:");
                p.setName(scanner.nextLine());
                System.out.println("tuổi mới");
                p.setAge(Integer.parseInt(scanner.nextLine()));

                displayGener();
                System.out.println("chọn giới tính: ");
                int choice1 = Integer.parseInt(scanner.nextLine());
                String strUp = "";
                for (Integer key : k) {
                    if (choice1 == key) {
                        strUp = gender.get(key);
                    }
                }
                p.setGender(strUp);
                System.out.println("nhập điểm trung bình");
                p.setAvgPoint(Double.parseDouble(scanner.nextLine()));

                displayClassroom();
                System.out.println("Nhập lớp: ");
                int choice2 = Integer.parseInt(scanner.nextLine());
                Classroom str1Up = new Classroom();
                for (int i = 0; i < classroomManage.classrooms.size(); i++) {
                    if (choice2 == classroomManage.classrooms.get(i).getId()) {
                        str1Up = classroomManage.classrooms.get(i);
                    }
                    p.setClassroom(str1Up);
                }
            }
        }
    }

    @Override
    public void deleteStudent(Scanner scanner) {
        System.out.println("Nhập id bạn muốn xóa thông tin:");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrayList.size(); i++) {
            if (idDelete == arrayList.get(i).getId()) {
                arrayList.remove(i);
            }
        }
    }

    @Override
    public void searchStudent(Scanner scanner) {
        System.out.println("Nhập id hs muốn hiển thị");
        int idSearch = Integer.parseInt(scanner.nextLine());
        for (Student s : arrayList) {
            if (s.getId() == idSearch) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void displayAll() {
        for (Student s : arrayList) {
            System.out.println(s);
        }
    }

    public void displayStuClass(Scanner scanner) {
        displayClassroom();
        int choiceClass = Integer.parseInt(scanner.nextLine());
        for (Student sc : arrayList) {
            if (choiceClass == sc.getClassroom().getId()) {
                System.out.println(sc);
            }
        }
    }

    public void displayStuAvg() {
        arrayList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(((Student) o1).getAvgPoint(), ((Student) o2).getAvgPoint());
            }
        });
        displayAll();
    }

    public void displayStuMaxAvg() {
        double max = 0;
        Student studentNew = arrayList.get(0);
        for (Student sma : arrayList) {
            if (sma.getAvgPoint() > max) {
                max = sma.getAvgPoint();
                studentNew = sma;
            }
        }
        System.out.println(studentNew);
    }

    public void displayStuMinAvg() {
        double min = arrayList.get(0).getAvgPoint();
        Student studentNew = arrayList.get(0);
        for (Student sma : arrayList) {
            if (sma.getAvgPoint() < min) {
                min = sma.getAvgPoint();
                studentNew = sma;
            }
        }
        System.out.println(studentNew);
    }

    public void searchStuName(Scanner scanner){
        System.out.println("Nhập tên hs bạn muốn tìm: ");
        String nameSearch = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().toUpperCase().contains(nameSearch.toUpperCase())){
                System.out.println(arrayList.get(i));
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Không tìm thấy tên khả dụng...");
        }
    }

    public void addClassrom (Scanner scanner){
        System.out.println("Nhập thêm lớp:");
        System.out.println("Nhập id lớp mới:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên lớp moi: ");
        String name = scanner.nextLine();
        classroomManage.classrooms.add(new Classroom(id,name));
        displayClassroom();
    }

    public void searchClassByName(Scanner scanner){
        System.out.println("Nhập id của lớp muốn hiển thị: ");
        int idSearchByName = Integer.parseInt(scanner.nextLine());
       for (Classroom sN: classroomManage.classrooms){
           if (idSearchByName == sN.getId()){
               System.out.println(sN);
           }
       }

    }
}

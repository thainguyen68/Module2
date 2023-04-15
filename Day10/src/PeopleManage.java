import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PeopleManage implements Manage {
   static ArrayList<People> peopleList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public PeopleManage() {
//        People people = new People("Thai",23);
        Student student1 = new Student("Thai",23,6.8);
        Student student2 = new Student("Duong",21,9.9);
        Student student3 = new Student("Dung",21,1.1);
        peopleList.add(student1);
        peopleList.add(student2);
        peopleList.add(student3);
    }

    public PeopleManage(ArrayList<People> person) {
        this.peopleList = person;
    }

    public ArrayList<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(ArrayList<People> peopleList) {
        this.peopleList = peopleList;
    }

    public void create() {
        System.out.println("Nhập sô lượng đối tượng");
        int num1 = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num1; i++) {
            addPeople();
        }
    }

    @Override
    public void displayAllPeople() {
        for (People p : peopleList) {
            System.out.println(p);
        }
    }

    @Override
    public void addPeople() {
        System.out.println("Mời bạn nhập thông tin học viên:");
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("chọn kiểu đối tượng");
        System.out.println("1.kiểu đối tượng bình thường");
        System.out.println("2.kiểu đối tượng học viên:");
        int choiceType = Integer.parseInt(scanner.nextLine());
        if (choiceType == 1) {
            People people = new People(name, age);
            peopleList.add(people);
        }
        if (choiceType == 2) {
            System.out.println("Nhập điểm trung bình: ");
            double avg = Double.parseDouble(scanner.nextLine());
                Student student = new Student(name, age, avg);
                peopleList.add(student);

        }
    }

    @Override
    public void editPeople() {
        System.out.println("Nhập id mà bạn muốn sửa:");
        int idEdit = Integer.parseInt(scanner.nextLine());

        boolean check1 = false;

        for (int i = 0; i < peopleList.size(); i++) {
            if (peopleList.get(i).getId() == idEdit) {
                check1 = true;
                if (peopleList.get(i) instanceof Student) {
                    System.out.println("Nhập tên:");
                    peopleList.get(i).setName(scanner.nextLine());
                    System.out.println("Nhập tuổi:");
                    peopleList.get(i).setAge(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Nhập điểm TB");
                    ((Student) peopleList.get(i)).setAvg(Double.parseDouble(scanner.nextLine()));
                    System.out.println("Bạn đã sửa thành công!");
                } else {
                    System.out.println("Nhập tên:");
                    peopleList.get(i).setName(scanner.nextLine());
                    System.out.println("Nhập tuổi:");
                    peopleList.get(i).setAge(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Bạn đã sửa thành công!");
                }
            }
        }
        if (!check1) {
            System.out.println("Không tìm thấy id khả dụng...");
        }
    }

    @Override
    public void deletePeople() {
        System.out.println("Nhập id mà bạn muốn xóa:");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < peopleList.size(); i++) {
            if (idDelete == peopleList.get(i).getId()) {
                peopleList.remove(i);
            }
        }
        System.out.println("xóa thành công!");
    }

    @Override
    public void searchPeople() {
//        System.out.println("Nhập id mà bạn muốn tìm:");
//        int idSearch = Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i < peopleList.size(); i++) {
//            if (idSearch == peopleList.get(i).getId()) {
//                System.out.println(peopleList.get(i));
//            }
//        }
        System.out.println("Mời bạn nhập tên cần tìm");
        String name = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < peopleList.size(); i++) {
            if (peopleList.get(i).getName().contains(name)){
                System.out.println(peopleList.get(i));
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Không tìm thấy...");
        }
    }

    @Override
    public void totalAvg() {
        int sum = 0;
        for (int i = 0; i < peopleList.size(); i++) {
            if (peopleList.get(i) instanceof Student) {
                Student studentSum = (Student) peopleList.get(i);
                sum += studentSum.getAvg();
            }
        }
        System.out.println("Tổng điểm trung bình: " + sum);
    }


    @Override
    public void arrangeAvgOfStudent() {
        peopleList.sort(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
               Student student1 = (Student) o1;
               Student student2 = (Student) o2;
               if (student1.getAvg()>student2.getAvg()){
                   return 1;
               }
               else if (student1.getAvg()<student2.getAvg()){
                   return -1;
               }
               else {
                   return 0;
               }
//                return ((Student) o1).setAvg().compareTo((Student) o2).setAvg());
            }
        });
    }


//    public void getPeople() {
//        System.out.println("Mời bạn nhập thông tin học viên:");
//        System.out.println("Nhập tên: ");
//        String name = scanner.nextLine();
//        System.out.println("Nhập tuổi: ");
//        int age = Integer.parseInt(scanner.nextLine());
//    }


}

package miniTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class HumanManage implements Manage<Human> {
    private final ArrayList<Human> humans;
    private final Scanner scanner;

    public HumanManage(Scanner scanner) {
        humans = new ArrayList<>();
        humans.add(new Human("duong", 22));
        humans.add(new Human("duong1", 24));
        humans.add(new Student("duong2", 25, 6));
        humans.add(new Student("duong210", 55, 3));
        humans.add(new Student("duong3", 28, 5.7));
        humans.add(new Student("duong4", 18, 4));
        this.scanner = scanner;
    }

    @Override
    public void create() {
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input age: ");
        int age = Integer.parseInt(scanner.nextLine());
        humans.add(new Human(name, age));
    }

    public void createStudent() {
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Input average point: ");
        double avg = Double.parseDouble(scanner.nextLine());
        humans.add(new Student(name, age, avg));
    }

    @Override
    public void update() {
        Human human = getById();
        if (human != null) {
            System.out.println("Input new name: ");
            String name = scanner.nextLine();
            if (!name.equals("")) {
                human.setName(name);
            }
            System.out.println("Input new age: ");
            String age = scanner.nextLine();
            if (!age.equals("")) {
                human.setAge(Integer.parseInt(age));
            }
            if (human instanceof Student) {
                Student student = (Student) human;
                System.out.println("Input new average point: ");
                String avg = scanner.nextLine();
                if (!avg.equals("")) {
                    student.setAveragePoint(Double.parseDouble(avg));
                }
            }
        } else {
            System.out.println("Not exist id!");
        }
    }

    @Override
    public Human deleteById() {
        Human human = getById();
        if (human != null) {
            humans.remove(human);
            return human;
        } else {
            System.out.println("Not exist id!");
            return null;
        }
    }

    @Override
    public Human getById() {
        System.out.println("Input id your choice: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Human human : humans) {
            if (human.getId() == id) {
                return human;
            }
        }
        return null;
    }

    public void displayAll() {
        System.out.printf("%-5s%-15s%-7s%s",
                "ID", "NAME", "AGE", "AVG_POINT\n");
        for (Human human : humans) {
            human.display();
        }
    }

    public void displayAllStudent() {
        System.out.printf("%-5s%-15s%-7s%s",
                "ID", "NAME", "AGE", "AVG_POINT\n");
        for (Human human : humans) {
            if (human instanceof Student) {
                human.display();
            }
        }
    }

    public void sortByAverage() {
        humans.sort(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                if (o1 instanceof Student && o2 instanceof Student) {
                    return Double.compare(((Student) o1).getAveragePoint(), ((Student) o2).getAveragePoint());
                }
                return 0;
            }
        });
        displayAllStudent();
    }

    public double sumAverage() {
        double sum = 0;
        for (Human human : humans) {
            if (human instanceof Student) {
                sum += ((Student) human).getAveragePoint();
            }
        }
        return sum;
    }
}

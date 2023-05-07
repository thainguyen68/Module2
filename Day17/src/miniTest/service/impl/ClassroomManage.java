package miniTest.service.impl;

import miniTest.model.Classroom;
import miniTest.service.IOFile;
import miniTest.service.Manage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassroomManage implements Manage<Classroom> {

    private final Scanner scanner;
    private final ArrayList<Classroom> classrooms;

    IOFile ioFile = new IOFile();

    public ClassroomManage(Scanner scanner) throws IOException {
        this.scanner = scanner;
        classrooms = new ArrayList<>();
//        classrooms.add(new Classroom(1, "C0223I1"));
//        classrooms.add(new Classroom(2, "C1022I1"));
        ioFile.readFileClassroom(getClassrooms());
    }

    public ArrayList<Classroom> getClassrooms() {
        return classrooms;
    }

    @Override
    public Classroom create() throws IOException {
        System.out.println("Input id classroom: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input name classroom: ");
        String name = scanner.nextLine();
        Classroom classroom = new Classroom(id, name);
        classrooms.add(classroom);
        ioFile.writeFileClassroom(getClassrooms());
        return classroom;
    }

    @Override
    public Classroom update() throws IOException {
        Classroom classroom = getById();
        if (classroom != null) {
            System.out.println("Input new name classroom: ");
            String name = scanner.nextLine();
            if (!name.equals("")) {
                classroom.setName(name);
            }
        }
        ioFile.writeFileClassroom(getClassrooms());
        return classroom;
    }

    @Override
    public Classroom delete() throws IOException {
        Classroom classroom = getById();
        if (classroom != null) {
            classrooms.remove(classroom);
        }
        ioFile.writeFileClassroom(getClassrooms());
        return classroom;
    }

    @Override
    public Classroom getById() {
        displayAll();
        System.out.println("Input id you want to find: ");
        String i = scanner.nextLine();
        if (!i.equals("")) {
            int id = Integer.parseInt(i);
            for (Classroom classroom : classrooms) {
                if (classroom.getId() == id) {
                    return classroom;
                }
            }
        }
        return null;
    }

    @Override
    public void displayAll() {
        System.out.printf("%-10s%s", "ID", "NAME\n");
        for (Classroom classroom : classrooms) {
            classroom.display();
        }
    }

    public void displayOne(Classroom classroom) {
        if (classroom != null) {
            classroom.display();
        } else {
            System.out.println("Not exist this object!");
        }
    }
}

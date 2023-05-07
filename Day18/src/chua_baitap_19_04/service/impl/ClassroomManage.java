package chua_baitap_19_04.service.impl;

import chua_baitap_19_04.io.IOFile;
import chua_baitap_19_04.model.Classroom;
import chua_baitap_19_04.service.Manage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassroomManage implements Manage<Classroom>, IOFile<Classroom> {

    private final Scanner scanner;
    private final ArrayList<Classroom> classrooms;
    private final String PATH_FILE = "C:\\Users\\ADMIN\\Desktop\\Module_C0223\\src\\minitest\\baitap_19_04\\data\\classroom.txt";

    public ClassroomManage(Scanner scanner) {
        this.scanner = scanner;
        classrooms = readBinary(PATH_FILE);
        checkDefaultIndex();
    }

    private void checkDefaultIndex() {
        if (classrooms.isEmpty()) {
            Classroom.INDEX = 0;
        } else {
            Classroom.INDEX = classrooms.get(classrooms.size() - 1).getId();
        }
    }

    @Override
    public Classroom create() {
        System.out.println("Input name classroom: ");
        String name = scanner.nextLine();
        Classroom classroom = new Classroom(name);
        classrooms.add(classroom);
        writeBinary(classrooms, PATH_FILE);
        return classroom;
    }

    @Override
    public Classroom update() {
        Classroom classroom = getById();
        if (classroom != null) {
            System.out.println("Input new name classroom: ");
            String name = scanner.nextLine();
            if (!name.equals("")) {
                classroom.setName(name);
            }
        }
        write(classrooms, PATH_FILE);
        return classroom;
    }

    @Override
    public Classroom delete() {
        Classroom classroom = getById();
        if (classroom != null) {
            classrooms.remove(classroom);
        }
        write(classrooms, PATH_FILE);
        return classroom;
    }

    @Override
    public Classroom getById() {
        displayAll();
        int id;
        do {
            try {
                System.out.println("Input id you want to find: ");
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Have error, please try again!");
            }
        } while (true);

        for (Classroom classroom : classrooms) {
            if (classroom.getId() == id) {
                return classroom;
            }
        }
        return null;
    }

    public Classroom getById(int id) {
        for (Classroom classroom : classrooms) {
            if (classroom.getId() == id) {
                return classroom;
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

    @Override
    public void write(List<Classroom> e, String path) {
        File file = new File(path);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (Classroom classroom : e) {
                bufferedWriter.write(classroom.getId() + "," + classroom.getName() + "\n");
            }
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }

    @Override
    public ArrayList<Classroom> read(String path) {
        File file = new File(path);
        ArrayList<Classroom> classrooms = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                String[] strings = data.split(",");
                classrooms.add(new Classroom(Integer.parseInt(strings[0]), strings[1]));
            }
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
        return classrooms;
    }

    @Override
    public void writeBinary(List<Classroom> e, String path) {
        File file = new File(path);
        try (ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(e);
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }

    @Override
    public ArrayList<Classroom> readBinary(String path) {
        File file = new File(path);
        ArrayList<Classroom> classrooms = new ArrayList<>();
        try (ObjectInputStream objectInputStream
                     = new ObjectInputStream(new FileInputStream(file))) {
            classrooms = (ArrayList<Classroom>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException ioException) {
            System.err.println(ioException.getMessage());
        }
        return classrooms;
    }
}

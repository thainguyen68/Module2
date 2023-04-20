package miniTest;

import java.util.Scanner;

public interface Manage<E> {
     void addStudent();
     void editStudent();
     void deleteStudent(Scanner scanner);
     void searchStudent(Scanner scanner);
     void displayAll();

}

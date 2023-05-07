package miniTest.service;

import miniTest.model.Classroom;
import miniTest.model.Student;

import java.io.*;
import java.util.List;

public class IOFile {
    public void writeFileStudent(List<Student> students) throws IOException {
        File f = new File("E:\\.C0223I1\\Module2\\Day17\\src\\miniTest\\Data\\student.txt");
        FileWriter fileWriter = new FileWriter(f);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Student student: students){
            bufferedWriter.write(student.toString()+"\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }

    public void writeFileClassroom(List<Classroom> classrooms) throws IOException {
        File f = new File("E:\\.C0223I1\\Module2\\Day17\\src\\miniTest\\Data\\classroom.txt");
        FileWriter fileWriter = new FileWriter(f);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Classroom classroom: classrooms){
            bufferedWriter.write(classroom.toString()+"\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }

    public void readFileStudent(List<Student> students) throws IOException {
        File f = new File("E:\\.C0223I1\\Module2\\Day17\\src\\miniTest\\Data\\student.txt");
        FileReader fileReader = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String c;
        while ((c= bufferedReader.readLine()) != null){
            String[] str = c.split(",");
            Student student = new Student(Integer.parseInt(str[0]),str[1], Integer.parseInt(str[2]), str[3], Double.parseDouble(str[4]), new Classroom(Integer.parseInt(str[5]),str[6]));
            students.add(student);
        }
        bufferedReader.close();
        fileReader.close();
    }

    public void readFileClassroom(List<Classroom> classrooms) throws IOException {
        File f = new File("E:\\.C0223I1\\Module2\\Day17\\src\\miniTest\\Data\\classroom.txt");
        FileReader fileReader = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String c;
        while ((c= bufferedReader.readLine()) != null){
            String[] str = c.split(",");
            Classroom classroom = new Classroom((Integer.parseInt(str[0])), str[1]);
            classrooms.add(classroom);
        }
        bufferedReader.close();
        fileReader.close();
    }
}

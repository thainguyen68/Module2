package ThucHanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainStuden1 {
    public static void main(String[] args) {
        Student1 student = new Student1("Kien", 30, "HT");
        Student1 student1 = new Student1("Nam", 26, "HN");
        Student1 student2 = new Student1("Anh", 38, "HT" );
        Student1 student3 = new Student1("Tung", 38, "HT" );

        List<Student1> lists = new ArrayList<Student1>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        System.out.println("So sanh theo ten___________:");
        for(Student1 st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi___________:");
        for(Student1 st : lists){
            System.out.println(st.toString());
        }
    }

}

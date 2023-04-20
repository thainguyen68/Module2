package miniTest;

import java.util.ArrayList;

public class ClassroomManage {


    ArrayList<Classroom> classrooms = new ArrayList<>();

    public ClassroomManage() {
        Classroom classroom = new Classroom(1, "12a");
        Classroom classroom1 = new Classroom(2, "12b");
        classrooms.add(classroom);
        classrooms.add(classroom1);


    }


}

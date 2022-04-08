package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentRepo {

    public static List<Student> getAllStudents(){
        Student s1= new Student("Ram",1, Arrays.asList("10","20","30"));
        Student s2= new Student("Shyam",2, Arrays.asList("15","10","250"));
        Student s3= new Student("Jadu",3, Arrays.asList("100","200","300"));
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        return studentList;
    }
}

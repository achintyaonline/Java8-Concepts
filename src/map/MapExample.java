package map;
import model.Student;
import model.StudentRepo;

import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> allStudents = StudentRepo.getAllStudents();
        //map maps single values using mapper
        // here the mapper is "student -> student.getName()"
        List<String> studentNames = allStudents.stream().map(student -> student.getName()).toList();
        System.out.println(studentNames);

        //Same code using method reference
        List<String> studentNames1 = allStudents.stream().map(Student::getName).toList();
        System.out.println(studentNames1);

        //flatmap maps List values using mapper
        // here the mapper is "student -> student.getMarks().stream()"
        List<String> studentMarks = allStudents.stream().flatMap(student -> student.getMarks().stream()).toList();
        System.out.println(studentMarks);


    }
}

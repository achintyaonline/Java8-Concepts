package optional;

import model.Student;
import model.StudentRepo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    static List<Student> allStudents = null;
    static {
        allStudents = StudentRepo.getAllStudents();
    }
    public static void main(String[] args) {
        Student s1= new Student("Ram",1, Arrays.asList("10","20","30"));
        System.out.println(Optional.ofNullable(s1.getName()).map(String::toUpperCase).orElse("Default Name"));

        //With null name
        Student s2= new Student(null,1, Arrays.asList("10","20","30"));
        System.out.println(Optional.ofNullable(s2.getName()).map(String::toUpperCase).orElse("Default Name"));

        System.out.println(Optional.ofNullable(s2.getName()).map(String::toUpperCase).orElseGet(() -> "Default name 1"));

        //System.out.println(Optional.ofNullable(s2.getName()).map(String::toUpperCase).orElseThrow(() -> new IllegalArgumentException("Name cant be null")));

        System.out.println(getStudentsByName("ram"));

        System.out.println(getStudentsByName("abcd"));

    }

    private static Student getStudentsByName(String name) {
        return allStudents.stream()
                .filter(student -> student.getName().equalsIgnoreCase(name)).findAny()
                .orElseThrow(() -> new RuntimeException("Cant find student by name "+name));
    }
}

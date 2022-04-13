package map;

import model.Student;
import model.StudentRepo;

import java.util.*;

public class ReduceExample {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(10, 20, 30, 45, 12, 6);
        //One way to sum
        System.out.println(integers.stream().reduce((integer1, integer2) -> integer1+integer2).orElse(0));
        //Another way
        System.out.println(integers.stream().reduce(Integer::sum).orElse(0));

        //Sum of even numbers
        System.out.println(integers.stream().filter(integer -> integer%2==0).reduce(Integer::sum).orElse(0));

        List<Student> allStudents = StudentRepo.getAllStudents();

        //Find total marks of each student
        Map<String,Integer> studentMap = new HashMap<>();
        allStudents.stream().forEach(student -> {
            Optional<Integer> summarks = student.getMarks().stream().map(Integer::parseInt).reduce(Integer::sum);
            studentMap.put(student.getName(),summarks.orElse(0));
        });
        System.out.println(studentMap);
    }
}

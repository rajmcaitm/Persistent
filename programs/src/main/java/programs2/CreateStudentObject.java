package programs2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

class Student {

    String name;
    int rollno;

    public Student(String name, int rollno) {
        super();
        this.name = name;
        this.rollno = rollno;
    }
}

public class CreateStudentObject {

    public static void main(String[] args) {

        BiFunction<String, Integer, Student> bf = (name, rollno) -> new Student(name, rollno);

        Student s = bf.apply("Dharya", 101);

        System.out.println("Name     : " + s.name);
        System.out.println("Roll No. : " + s.rollno);

        List<Student> students = new ArrayList<>();

        students.add(bf.apply("Warne", 1001));
        students.add(bf.apply("Murali", 1002));
        students.add(bf.apply("Kumble", 1003));
        students.add(bf.apply("Vettori", 1004));
        students.add(bf.apply("Saqlain", 1005));


        for(Student student : students) {

            System.out.println("Name : " + student.name + "\t Roll No : " + student.rollno);
        }
    }
}
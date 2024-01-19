package programs1;

import java.util.function.Function;

class Student {

    String name;
    int marks;

    public Student(String name, int marks) {
        super();
        this.name = name;
        this.marks = marks;
    }
}

public class PredicateFunctionCombination {

    public static void main(String[] args) {

        Predicate<Student> p = m ->m.marks >= 60;

        Function<Student, String> f = student -> {

            if (student.marks >= 90)
                return "Merit";
            else if (student.marks >= 75)
                return "Distinction";
            else if (student.marks >= 60)
                return "First class";
            else if (student.marks >= 50)
                return "Second class";
            else if (student.marks >= 35)
                return "Pass class";
            else
                return "Failed";
        };

        Student[] sArray = {
                new Student("Vijay", 97),
                new Student("Ajith", 78),
                new Student("Vikram", 66),
                new Student("Surya", 54),
                new Student("Karthi", 43),
                new Student("Arya", 31)
        };

        System.out.println("Name\tMarks\tGrade\n");
        for (Student s : sArray) {

            if (p.test(s)) {

                System.out.println(s.name + "\t" + s.marks + "\t" + f.apply(s));
            }
        }
    }
}
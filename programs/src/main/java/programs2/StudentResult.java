package programs2;

class StudentTest {

   String name;
    int marks;

    public StudentTest(String name, int marks) {
        super();
        this.name = name;
        this.marks = marks;
    }
}

public class StudentResult {
 
    public static void main(String[] args) {
 
        BiConsumer<StudentTest, Integer> c = (s, i) -> s.marks = s.marks + 5;
 
        // create Student object with name and initial marks
        StudentTest[] sArray = {
                new StudentTest("Vijay", 92),
                new StudentTest("Ajith", 78),
                new StudentTest("Vikram", 66),
                new StudentTest("Surya", 54),
                new StudentTest("Karthi", 43),
                new StudentTest("Arya", 31)
        };
 
        // invoke BiConsumer FI, iterating through all Students
        for(StudentTest s : sArray) {
            c.accept(s, 5);
        }
 
        // printing to console
        for(StudentTest s : sArray) {
            System.out.println("Name : " + s.name + "\tMarks : " + s.marks);
        }
    }
}
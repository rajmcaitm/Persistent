package programs1;

public class PrintStudentInfoUsingConsumerFI {

    public static void main(String[] args) {

        Consumer<Student> c = s ->  {
            System.out.print("Name : " + s.name + "\t");
            System.out.println("Marks : " + s.marks);
        };

        Student[] sArray = {
                new Student("Vijay", 97),
                new Student("Ajith", 78),
                new Student("Vikram", 66),
                new Student("Surya", 54),
                new Student("Karthi", 43),
                new Student("Arya", 31)};

        // invoke Consumer FI, iterating through all Students
        for (Student s : sArray) {
            c.accept(s);
        }
    }
}
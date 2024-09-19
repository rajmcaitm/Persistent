package programs2;

public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            System.out.println("Try block");
            System.exit(0); // Finally block will not be executed
        } catch (Exception e) {
            System.out.println("Catch block");
        } finally {
            System.out.println("Finally block"); // Skipped
        }
    }
}
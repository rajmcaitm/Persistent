package programs2;

// Define two interfaces
interface A {
    void print();
}

interface B {
    void print();

}

// Create a class that implements both interfaces
class C implements A, B {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    public static void main(String[] args) {
        A doc = new C();
        B doc1 = new C();
        doc.print();
        doc1.print();

    }
}
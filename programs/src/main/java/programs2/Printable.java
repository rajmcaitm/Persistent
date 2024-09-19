package programs2;

// Define two interfaces
interface Printable {
    void print();
}

interface Shareable {
    void share();
}

// Create a class that implements both interfaces
class Document implements Printable, Shareable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void share() {
        System.out.println("Sharing document...");
    }

    public static void main(String[] args) {
        Printable doc = new Document();
        Shareable doc1 = new Document();
        doc.print();
        doc1.share();
    }
}
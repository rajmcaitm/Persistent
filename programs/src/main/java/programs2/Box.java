package programs2;

public class Box<T, U> {
    private T value1;
    private U value2;

    public Box(T value1, U value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public U getValue2() {
        return value2;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public void setValue2(U value2) {
        this.value2 = value2;
    }

    public static void main(String[] args) {
        Box<String, Integer> box = new Box<>("Hello", 42);
        String value1 = box.getValue1();
        int value2 = box.getValue2();
        System.out.println(value1 + " " + value2);
    }
}
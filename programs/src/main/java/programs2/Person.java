package programs2;

import java.io.*;

public class Person  {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("John Doe", 30);

        // Serialize the person object
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(person);
        oos.close();

        // Deserialize the person object
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Person deserializedPerson = (Person) ois.readObject();
        ois.close();

        System.out.println(deserializedPerson.name); // Output: John Doe
        System.out.println(deserializedPerson.age); // Output: 30

    }
}
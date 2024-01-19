package program3;

public class SingletonDesignPattern {
    private static final SingletonDesignPattern instance = new SingletonDesignPattern();

    private SingletonDesignPattern() {
    }

    public static SingletonDesignPattern getInstance() {
        return instance;
    }
}

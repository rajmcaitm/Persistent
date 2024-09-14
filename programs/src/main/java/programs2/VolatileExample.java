package programs2;

public class VolatileExample {
    private volatile boolean stopped = false;

    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();
        example.stop();
        example.run();

    }

    public void stop() {
        stopped = true;
    }

    public void run() {
        while (!stopped) {
            System.out.println("Running...");
        }
        System.out.println("Stopped :"+stopped);
    }
}
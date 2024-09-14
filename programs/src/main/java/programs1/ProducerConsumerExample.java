package programs1;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ProducerConsumerExample {
    private final BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
    private final int capacity = 5;

    public void produce() throws InterruptedException {
        int count = 0;
        while (count < 10) {
            int item = count;
            if (queue.remainingCapacity() == 0) {
                queue.put(item);
                TimeUnit.SECONDS.sleep(1);
            } else {
                queue.put(item);
            }
            count++;
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            int item = queue.take();
            System.out.println("Consumed item: " + item);
        }
    }

    public static void main(String[] args) {
        ProducerConsumerExample example = new ProducerConsumerExample();
        Thread producer = new Thread(() -> {
            try {
                example.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread consumer = new Thread(() -> {
            try {
                example.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        producer.start();
        consumer.start();
    }
}
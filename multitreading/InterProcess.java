import java.util.concurrent.TimeUnit;

class MyData {
    private int value;
    private boolean isProducerTurn = true;

    synchronized public void set(int v) {
        while (!isProducerTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        value = v;
        isProducerTurn = false;
        notifyAll();
    }

    synchronized public int get() {
        while (isProducerTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        int x = value;
        isProducerTurn = true;
        notifyAll();
        return x;
    }
}

class Producer extends Thread {
    private final MyData data;

    public Producer(MyData d) { this.data = d; }

    @Override
    public void run() {
        int counter = 1;
        try {
            while (!Thread.currentThread().isInterrupted()) {
                data.set(counter);
                System.out.println("Producer produced: " + counter++);
                // Using TimeUnit is often preferred over Thread.sleep()
                TimeUnit.MILLISECONDS.sleep(500); 
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer extends Thread {
    private final MyData data;

    public Consumer(MyData d) { this.data = d; }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                int val = data.get();
                System.out.println("Consumer consumed: " + val);
                TimeUnit.MILLISECONDS.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class InterProcess {
    public static void main(String[] args) {
        MyData dat = new MyData();
        new Producer(dat).start();
        new Consumer(dat).start();
    }
}
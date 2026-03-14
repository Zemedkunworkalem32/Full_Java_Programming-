class ThreadMethods extends Thread {

    public ThreadMethods(String name) {
        setName(name); // set thread name
    }
      @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " is running, step " + i);

            try {
                Thread.sleep(500); // pause thread for 0.5 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            Thread.yield(); // allow other threads to run
        }
    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ThreadMethods t1 = new ThreadMethods("Thread-1");
        ThreadMethods t2 = new ThreadMethods("Thread-2");

        t1.setPriority(7);
        t2.setPriority(3);

        System.out.println(t1.getName() + " priority: " + t1.getPriority());
        System.out.println(t2.getName() + " priority: " + t2.getPriority());

        t1.start();
        t2.start();

        System.out.println("Is t1 alive? " + t1.isAlive());

        t1.join(); // wait until t1 finishes

        System.out.println("t1 finished, now main continues");

        System.out.println("Is t1 alive? " + t1.isAlive());
    }
}
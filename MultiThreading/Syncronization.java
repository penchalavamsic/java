// Counter class
class Counter {
    private int count = 0;

    // increment using synchronized block
    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    // decrement using synchronized block
    public void decrement() {
        synchronized (this) {
            count--;
        }
    }

    public int getCount() {
        return count;
    }
}

// Mycount implements Runnable (task for thread)
class Mycount implements Runnable {
    Counter counter;

    public Mycount(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
            counter.decrement();
        }
    }
}

// Main class
public class Syncronization {
    public static void main(String args[]) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(new Mycount(c));
        Thread t2 = new Thread(new Mycount(c));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count = " + c.getCount());
    }
}

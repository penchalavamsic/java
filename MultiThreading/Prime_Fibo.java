class Shared {
    boolean primeTurn = true; // true = prime's turn
}

public class Prime_Fibo {
    public static void main(String[] args) {
        Shared s = new Shared();

        // Prime Thread
        Thread t1 = new Thread(() -> {
            for (int num = 2; num <= 50; num++) {
                int count = 0;
                for (int j = 1; j <= num; j++) if (num % j == 0) count++;
                if (count == 2) { // prime found
                    synchronized (s) {
                        while (!s.primeTurn) {
                            try { s.wait(); } catch (InterruptedException e) {}
                        }
                        System.out.println("Prime: " + num);
                        s.primeTurn = false; // switch turn
                        s.notify();           // wake Fibonacci thread
                    }
                }
            }
        });

        // Fibonacci Thread
        Thread t2 = new Thread(() -> {
            int a = 0, b = 1;
            for (int i = 0; i < 15; i++) { // print first 15 Fibonacci numbers
                synchronized (s) {
                    while (s.primeTurn) { // wait if it's prime's turn
                        try { s.wait(); } catch (InterruptedException e) {}
                    }
                    System.out.println("Fibo: " + a);
                    int c = a + b;
                    a = b;
                    b = c;
                    s.primeTurn = true; // switch turn
                    s.notify();          // wake prime thread
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Counter {
    private int count = 0;

    // synchronized method ensures only one thread can access at a time
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
    }

    public int getCount() {
        return count;
    }
}

class MyThread extends Thread {
    Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
            try {
                Thread.sleep(50); // simulate some delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

 class SynchronizationDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();

        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}
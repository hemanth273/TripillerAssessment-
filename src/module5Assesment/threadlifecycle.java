package module5Assesment;

class LifeCycleThread extends Thread {
    public void run() {
        System.out.println(getName() + " is in Running state");

        try {
            Thread.sleep(1000); // Thread in Timed Waiting
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted");
        }

        System.out.println(getName() + " completed execution (Terminated state)");
    }
}
 class ThreadLifeCycleDemo {
    public static void main(String[] args) {
        LifeCycleThread t1 = new LifeCycleThread();
        LifeCycleThread t2 = new LifeCycleThread();

        System.out.println(t1.getName() + " is in New state");
        System.out.println(t2.getName() + " is in New state");

        t1.start();  // New -> Runnable -> Running
        t2.start();

        System.out.println("Main thread is running");

        try {
            t1.join(); // Main thread waits for t1 to finish
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished execution");
    }
}
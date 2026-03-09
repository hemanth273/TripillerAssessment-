package module5Assesment;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
    }
}

 class RunnableThreadDemo {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);  // create Thread object with Runnable
        t.start();                 // start the thread

        System.out.println("Main method is running");
    }
}

package module5Assesment;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
    }
}

 class ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();  // create thread object
        t.start();                    // start the thread

        System.out.println("Main method is running");
    }
}
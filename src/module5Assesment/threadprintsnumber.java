package module5Assesment;

class SharedPrinter {
    private boolean isOddTurn = true; // start with odd thread

    public synchronized void printOdd(int number) {
        while (!isOddTurn) { // wait if it's not odd's turn
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd Thread: " + number);
        isOddTurn = false;
        notify(); // wake up even thread
    }

    public synchronized void printEven(int number) {
        while (isOddTurn) { // wait if it's not even's turn
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even Thread: " + number);
        isOddTurn = true;
        notify(); // wake up odd thread
    }
}

class OddThread extends Thread {
    SharedPrinter printer;

    OddThread(SharedPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            printer.printOdd(i);
        }
    }
}

class EvenThread extends Thread {
    SharedPrinter printer;

    EvenThread(SharedPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            printer.printEven(i);
        }
    }
}

 class AlternateNumbersDemo {
    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();

        Thread t1 = new OddThread(printer);
        Thread t2 = new EvenThread(printer);

        t1.start();
        t2.start();
    }
}

package AssesmentMadule1;

 interface Vehicle {
    void start();   // abstract method
}

    class Car implements Vehicle {

        // implementation of start() method
        public void start() {
            System.out.println("Car is starting");
        }

        public static void main(String[] args) {
            Car c = new Car();
            c.start();
        }
    }


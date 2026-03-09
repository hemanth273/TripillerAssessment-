package AssesmentMadule1;

abstract class shape {
    // abstract method
    abstract void display();
}

    class Circle extends shape {

        // implementation of abstract method
        void display() {
            System.out.println("This is a Circle");
        }

        public static void main(String[] args) {
            Circle c = new Circle();
            c.display();
        }
    }


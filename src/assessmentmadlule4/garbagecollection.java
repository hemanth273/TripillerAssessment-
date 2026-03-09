package AssesmentMadule1;

class GarbageCollectionDemo {

    public void finalize() {
        System.out.println("Garbage collected");
    }

    public static void main(String[] args) {

        GarbageCollectionDemo obj = new GarbageCollectionDemo();

        obj = null;   // object becomes eligible for garbage collection

        System.gc();  // request JVM to run garbage collector
    }
}

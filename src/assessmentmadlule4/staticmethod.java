package AssesmentMadule1;

class StaticDemo {

    static int count = 0;   // static variable

    static void showCount() {   // static method
        System.out.println("Count value: " + count);
    }

    public static void main(String[] args) {

        StaticDemo.count = 5;   // accessing static variable
        StaticDemo.showCount(); // calling static method
    }
}

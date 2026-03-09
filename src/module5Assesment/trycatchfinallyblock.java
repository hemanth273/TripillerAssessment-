package module5Assesment;
 class TryCatchFinallyDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result;

        try {
            result = a / b;  // may throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("This block always executes");
        }

        System.out.println("Program continues...");
    }
}
package module5Assesment;

class MyCustomException extends Exception {
    // constructor
    public MyCustomException(String message) {
        super(message);
    }
}

 class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            // some condition to throw exception
            boolean error = true;

            if (error) {
                throw new MyCustomException("This is a custom exception!");
            }

            System.out.println("No exception occurred");
        } catch (MyCustomException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
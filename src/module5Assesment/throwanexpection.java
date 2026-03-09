package module5Assesment;

class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}
 class AgeCheckDemo {
    public static void main(String[] args) {
        int age = 15;

        try {
            if (age < 18) {
                throw new AgeNotValidException("Age must be 18 or older!");
            } else {
                System.out.println("Age is valid.");
            }
        } catch (AgeNotValidException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
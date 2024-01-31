package College;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Attempt to divide by zero
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the ArithmeticException
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        } finally {
            // This block will always be executed, regardless of whether an exception occurred
            System.out.println("Finally block executed.");
        }

        // Continue with the program after exception handling
        System.out.println("Program continues...");
    }
}

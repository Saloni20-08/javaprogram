public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a); 
            int b = 42 / a; 
            int c = args[1];
            c[42] = 99;
            } 
 catch (ArithmeticException e) {
            System.out.println("Division by zero error.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Error.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        System.out.println("After try-catch blocks.");
    }
}
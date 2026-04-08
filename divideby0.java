import java.util.Scanner;

// Custom Exception Class
class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

public class divideby0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the 2 numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b == 0) {
                throw new DivideByZeroException("DivideByZeroException caught");
            }

            int result = a / b;
            System.out.println("The quotient of " + a + "/" + b + " = " + result);
        } 
        catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("Inside finally block");
        }

        sc.close();
    }
}
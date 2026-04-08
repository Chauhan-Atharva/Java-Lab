import java.util.Scanner;

public class arrayIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the array");
            String input = sc.nextLine();

            // Explicit check
            if (!input.matches("\\d+")) {
                throw new NumberFormatException("Invalid number format");
            }

            int size = Integer.parseInt(input);

            int arr[] = new int[size];

            System.out.println("Enter the elements of the array");
            for (int i = 0; i < size; i++) {
                String element = sc.nextLine();

                if (!element.matches("\\d+")) {
                    throw new NumberFormatException("Invalid number format");
                }

                arr[i] = Integer.parseInt(element);
            }

            System.out.println("Enter the index");
            int index = Integer.parseInt(sc.nextLine());

            if(index < 0 || index > size - 1)  throw new ArrayIndexOutOfBoundsException("Invalid index");


            System.out.println("Element at index " + index + " = " + arr[index]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } 
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
        }

        sc.close();
    }
}
import java.util.*;

public class lab425feb {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        StringTokenizer st = new StringTokenizer(input, " ");
        String result = "";

        while (st.hasMoreTokens()) {
            String word = st.nextToken();

            // Reverse + Toggle
            String reversedToggled = "";
            
            for (int i = word.length() - 1; i >= 0; i--) {
                char ch = word.charAt(i);

                if (Character.isUpperCase(ch)) {
                    reversedToggled += Character.toLowerCase(ch);
                } else if (Character.isLowerCase(ch)) {
                    reversedToggled += Character.toUpperCase(ch);
                } else {
                    reversedToggled += ch;
                }
            }

            result += reversedToggled + " ";
        }

        System.out.println("Output: " + result.trim());
    }
}
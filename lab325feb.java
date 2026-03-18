import java.util.*; 
public class lab325feb{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        StringBuffer sb = new StringBuffer(st);

        int upper = 0, lower = 0, digit = 0, special = 0;

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (Character.isUpperCase(ch))
                upper++;
            else if (Character.isLowerCase(ch))
                lower++;
            else if (Character.isDigit(ch))
                digit++;
            else
                special++;
        }

        int total = sb.length();

        System.out.println("Uppercase %: " + (upper * 100.0 / total));
        System.out.println("Lowercase %: " + (lower * 100.0 / total));
        System.out.println("Digits %: " + (digit * 100.0 / total));
        System.out.println("Special Characters %: " + (special * 100.0 / total));
    }
}

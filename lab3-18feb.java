import java.util.Scanner;
import java.util.Stack;
public class lab3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.println("Enter the String: ");
        n = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<n.length(); i++){
            char ch = n.charAt(i);
        st.push(ch);
        }
        String rev = "";
        for(int i = 0; i<n.length(); i++){
           rev += st.pop();
        }
        n = rev;
        System.out.println("The reversed string: "+ n);



    }
}
import java.util.Scanner;
import java.util.Stack;

public class lab2 {
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> min = new Stack<>();
        System.out.println("Enter 10 values in the stack: ");
        int n;
        min.push(Integer.MAX_VALUE);
        for(int i = 0; i < 10; i++){
            n = sc.nextInt();
            stack.push(n);
            if(min.peek() > n ){
                min.push(n);
            }
        }
        System.out.println("The stack = "+ stack);
        System.out.println("The minimum element is = "+ min.peek());


    }
}
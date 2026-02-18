import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;

class lab1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter 5 values in the stack: ");
        int n;
        for(int i =0 ; i<5; i++){
            n = sc.nextInt();
            stack.push(n);
        }
        System.out.println("The stack: "+stack);
        System.out.println("Using pop operation on stack: ");
        n = stack.pop();
        System.out.println("Removed element: "+ n);
        System.out.println("The top element: "+ stack.peek());
        System.out.println("Is the stack empty: "+ stack.empty());
        System.out.println("The stack: "+stack);
        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println("Enter 5 values in the queue: ");
        for(int i =0 ; i<5; i++){
            n = sc.nextInt();
            queue.add(n);
        }
        System.out.println("The queue: "+ queue);
        System.out.println("Using poll operation on stack: ");
        n = queue.poll();
        System.out.println("Removed element: "+ n);
        System.out.println("The front element: "+ queue.peek());
        System.out.println("The queue: "+queue);
    }
}
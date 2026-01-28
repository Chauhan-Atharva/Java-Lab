import  java.util.*;
public class one{
    public static void main(String [] args){
        int n = Integer.parseInt((args[0]));
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact *= i;
        }
        System.out.println("Factorial of "+ args[0]+" "+fact);
    }
}
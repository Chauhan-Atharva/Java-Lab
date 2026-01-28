import  java.util.*;
public class two{
    public static void main(String [] args){
        int a = Integer.parseInt((args[0]));
        int b = Integer.parseInt((args[1]));
        int c = Integer.parseInt((args[2]));
        int g ;
        if(a>b){
            g = a;
        }
        else {
            g = b;
        }
        if(g<c){
            g = c;
        }
        System.out.println("Greatest of "+ args[0]+" "+args[1] +" "+args[2]+" is "+g);
    }
}
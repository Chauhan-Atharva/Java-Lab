import  java.util.*;
public class four{
    public static void main(String [] args){
        int a = Integer.parseInt((args[0]));
        int b = Integer.parseInt((args[1]));
        int s = (a>b)?b:a;
        while(true) {
            if(s%a == 0 && s%b ==0){
                break;
            }
            s++;
        }
        System.out.println("LCM of "+ args[0]+" "+args[1]+" is "+s);
    }
}
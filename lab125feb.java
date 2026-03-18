import java.util.*; 
public class lab125feb{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String st = sc.nextLine();
    StringTokenizer stk = new StringTokenizer(st," ");
    System.out.println("Printing all the tokens/words: ");
    while(stk.hasMoreTokens()){
        System.out.println(stk.nextToken());
    }
    }
}
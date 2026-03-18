import java.util.*; 
public class lab225feb{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] chars = s1.toCharArray();
        Arrays.sort(chars);
        s1 = new String(chars);
        chars = s2.toCharArray();
        Arrays.sort(chars);
        s2 = new String(chars);

        StringTokenizer st1 = new StringTokenizer(s1,"");
        StringTokenizer st2 = new StringTokenizer(s2,"");
        boolean isAnagram = true; 
        if(st1.countTokens() != st2.countTokens() ){
            isAnagram = false;
            System.out.println("unequal length");
        }
        else{
            while(st1.hasMoreTokens()){
                String a = st1.nextToken();
                String b = st2.nextToken();
                if(!a.equals(b)){
                    isAnagram = false; 
                    System.out.println("Character not mathching");
                    
                    break; 
                }
            }
        }
        if(isAnagram == false){
            System.out.println("The Strings are not anagram");
        }
        else
          System.out.println("The strings are anagram");
    }

}
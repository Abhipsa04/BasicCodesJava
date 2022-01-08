// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String temp = str1+str1;
        if(str1.length()==str2.length())
         System.out.println(temp.contains(str2));
        else
           System.out.println(false); 
    }
}

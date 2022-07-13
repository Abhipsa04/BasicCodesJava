import java.util.Scanner; 
public class Main {
public static void main(String[] args) {
String c="";
String vowel="aeiouAEIOU";
System.out.println("Enter the String : ");
Scanner sc= new Scanner(System.in);
String s= sc.next();
for( int i=0;i< s.length();i++){
if( vowel.indexOf(s.charAt(i)) ==-1){
c+=s.charAt(i);
}
}
System.out.println(c);
}
}
/*
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        String s = "prepinsta";
        String s1 = "";
        s1 = s.replaceAll("[aeiou]", ""); 
        System.out.println("String after removing vowel : "+s1); 
	}

}
*/

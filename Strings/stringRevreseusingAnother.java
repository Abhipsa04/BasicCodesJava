import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		String s1="";
		char ch;
		
		for(int i=0;i<str.length();i++)
		{
		    ch=str.charAt(i);
		    s1=ch+s1;
		}
		System.out.printf("Reversed String is : "+ s1);
	}
}

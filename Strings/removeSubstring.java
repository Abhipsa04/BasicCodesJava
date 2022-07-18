import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Enter the substring to be removed : ");
		String str1 = sc.nextLine();
		String newStr = str.replace(str1," ");
		System.out.println("New String is : ");
		System.out.println(newStr);
		
	}
}

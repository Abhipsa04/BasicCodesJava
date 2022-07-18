import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Enter the character: ");
		char ch = sc.nextLine().charAt(0);
		int count = 0 ;
		for(int i = 0 ; i< str.length();i++){
		    if(str.charAt(i)==ch){
		        count++;
		    }
		}
		System.out.println("The frequecey of the cahracter "+ch+" is : "+count);
	}
}

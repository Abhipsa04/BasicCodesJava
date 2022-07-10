import java.util.*;
public class Main
{
    static boolean isPalindrome(String str){
        int i = 0 ;
        int j = str.length()-1;
        str.toLowerCase();// making all cahracters in same case
        while(i<j){
           if( str.charAt(i)== str.charAt(j)){// matching first and last Character
               i++;// then incremnt i to compare second element
               j--;// decrement j to compare second last element
           }
           else // if condition fail then it is not a palindrome
             return false;
        }
        // if the whole loop if satisfies then it is palindrome
        return true;
    }
	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		if(isPalindrome(str1)){
		    System.out.println("Palindrome String");
		}
		else{
		System.out.println("Not Palindrome String");
		}
	}
}

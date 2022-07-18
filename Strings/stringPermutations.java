import java.util.*;
public class Main
{
    static String swapString(String s , int i , int j){
        char[] b = s.toCharArray();
        char ch;
        ch = b[i];
        b[i]=b[j];
        b[j]=ch;
        return String.valueOf(b);
    }
    static void generatePermutation(String str , int start , int end){
        if(start==end-1){
            System.out.println(str);
        }
        else{
            for (int i = start; i < end; i++)    
            {    
                //Swapping the string by fixing a character    
                str = swapString(str,start,i);    
                //Recursively calling function generatePermutation() for rest of the characters     
                generatePermutation(str,start+1,end);    
                //Backtracking and swapping the characters again.    
                str = swapString(str,start,i);    
            }   
        }
    }
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String inStr = sc.nextLine();
		int len = inStr.length();
		System.out.println("The Permutations are : ");
		generatePermutation(inStr,0,len);
	}
}

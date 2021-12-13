import java.util.*;
public class Main{
	public static void main(String []args)
    {

		  Scanner input = new Scanner (System.in);

		  	int size=input.nextInt();
	
	        int[] A = new int[size];

	         
	         
	         for (int i = 0;i< A.length; i++) {
	                
	                

	           A[i]=input.nextInt();
        
	         }
	         
	         int n = A.length;
	         
	         int a =largestPalindrome(A, n);
	         if(a!=-1)
	 	         System.out.print("longest palindrome number in the array  " +a);
             else
                 System.out.println("No Palindrome number is found");
     
         
    }

	    static boolean isPalindrome(int num){
        int rev = 0;
        int n = num;
        while (num!=0)
        {
            int rem = num % 10;
            rev = rev*10 + rem;
            num = num / 10;
        }
        if( n == rev)
            return true;
        else
           return false;
	    }

	    static int largestPalindrome(int []A, int n)
	    {

	        
	    	Arrays.sort(A);

	        for (int i = n - 1; i >= 0; --i) {
	     
	          
	            if (isPalindrome(A[i]))
	                return A[i];
	        }

	        return -1;
	    }
	     
	
	
}

import java.util.*;
public class Main
{
	 static int a=0,b=1,s=0;    
 static void printFibonacci(int n){    
    if(n>0){    
         s=a+b;
         a=b;
         b=s;
         System.out.print(" "+s);   
         printFibonacci(n-1);    
     }    
 }    
 public static void main(String args[]){   
  System.out.println("How many Terms U want to print: ");
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  System.out.print(a+" "+b);//printing 0 and 1    
  printFibonacci(n-2);//n-2 because 2 numbers are already printed   
 } 
}
/* Another approach 
class GFG {
  
    // Function to print the fibonacci series
    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;
  
        // Recursive call
        return fib(n - 1)
            + fib(n - 2);
    }
  
    // Driver Code
    public static void
    main(String args[])
    {
        // Given Number N
        int N = 10;
  
        // Print the first N numbers
        for (int i = 0; i < N; i++) {
  
            System.out.print(fib(i) + " ");
        }
    }
}
*/

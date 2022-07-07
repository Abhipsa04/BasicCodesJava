import java.util.*;

public class Main
{
    static boolean isPrime(int n){
        if(n<=1)
         return false;
        else if(n==2)
         return true;
        else if(n%2==0)
         return false;
        for(int i=3; i<Math.sqrt(n);i+=2){
            if(n%i==0)
             return false;
        }
        return true;
        
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower limit : ");
		int lower = sc.nextInt();
		System.out.println("Enter the upper limit : ");
		int upper= sc.nextInt();
		for(int i = lower ; i<=upper ; i++){
		    if(isPrime(i)==true){
		        System.out.println(i);
		    }
		}
		
	}
}

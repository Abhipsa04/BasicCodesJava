import java.util.*;
public class Main
{
   static int fact(int n){
        int f;
        for(f=1;n>1;n--){
            f*=n;
        }
        return f;
    }
    static int ncr(int n , int r){
        return fact(n)/(fact(n-r)*fact(r));
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of rows: ");
	    int n = sc.nextInt();
	    int i,j;
	    for( i=0; i<n; i++){
	        for(j=0;j<n-i;j++){
	            System.out.print(" ");
	        }
	        for(j=0;j<=i;j++){
	            System.out.print(" "+ncr(i,j));
	        }
	        System.out.println();
	    }
	}
}

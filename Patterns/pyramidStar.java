import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the Number of Rows: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =1 ; i <=n ; i++){
		    for(int k=2*n-i; k>=0 ; k--){
		        System.out.print(" ");
		    }
		    for(int j=1 ; j<=2*i-1; j++){
		        System.out.print("*");// print 2*i-1 number of stars
		    }
		    System.out.println();
		}
	}
}

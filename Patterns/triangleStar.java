import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the number of Rows: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<n ; i++){
		    for(int j=1; j<=i;j++){
		        System.out.print("*");// print as many stars as the row number
		        //i.e for row number 3 there will be 3 stars
		    }
		    System.out.println();
		}
	}
}

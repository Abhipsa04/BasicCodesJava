import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter no of rows : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i++){//  i is for rows
		    for(int k = i ; k > 0 ; k--){
		        System.out.print(" "); // for spaces in the i th row there is i number of spaces
		    }
		    for(int j= 0 ; j< n ; j++){
		        System.out.print("*");// for printing the stars
		    }
		    
		    System.out.println();
		}
		
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the no of rows: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0 ; i<n; i++){
		    for(int j = 0 ; j< n ; j++){
		        if(i==0||i==n-1){
		            System.out.print("*");// for first and last row print all stars
		            
		        }
		        else if(j==0 || j==n-1){
		            System.out.print("*");// in other cases print only first star and last star
		        }
		        else{
		            System.out.print(" ");// and middle will be spaces
		        }
		    }
		    System.out.println();// for going to nextline
		}
	}
}

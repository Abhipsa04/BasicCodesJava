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
		        
		        if(i==1||i==n){
		            System.out.print("*");// for first and last row print all stars
		            
		        }
		        else if(j==1 || j==2*i-1){
		            System.out.print("*");// in other cases print only first star and last star
		        }
		        else{
		            System.out.print(" ");// and middle will be spaces
		        }
		    }
		    System.out.println();
		}
	}
}

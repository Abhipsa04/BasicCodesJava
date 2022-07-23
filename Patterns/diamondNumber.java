import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the no of rows: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++){
		    for(int j=1;j<=n-i;j++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
		for(int i=n;i>0;i--)     
		   {
		      for(int k=n;k>=i;k--)     
		         System.out.print(" ");    
		      for(int j=i-1;j>=1;j--)     
		         System.out.print(j+" ");    
		      System.out.println();     
		   }
	}
}

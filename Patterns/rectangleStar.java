import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter no of Rows : ");
	    int r = sc.nextInt();
	    System.out.println("Enter no of Columns : ");
	    int c = sc.nextInt();
		for(int i =0 ; i< r; i++){ //outer for is for rows
		    for(int j=0 ; j<c; j++){// inner for is for columns
		        System.out.print("*");
		    }
		    System.out.println();// for going to next line
		}
	}
}


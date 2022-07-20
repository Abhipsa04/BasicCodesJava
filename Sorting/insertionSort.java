import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the array size: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Array Elements : ");
		for(int k = 0 ; k< n; k++){
		    arr[k]=sc.nextInt();
		}
	    System.out.println("The Unsorted array is  : ");
		for(int k = 0 ; k< n ; k++){
		    System.out.print(arr[k]+" ");
		}
		System.out.println();
        int i , j, temp;
        for(i = 1 ; i < n ; i++){
            temp = arr[i];
            j = i-1;
            while(j>=0 && temp<=arr[j]){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }

	System.out.println("The sorted array is  : ");
		for(int k = 0 ; k< n ; k++){
		    System.out.print(arr[k]+" ");
		}
}
}




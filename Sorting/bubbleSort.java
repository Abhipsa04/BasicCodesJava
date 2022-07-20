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
		for(int i = 0 ; i< n ; i++){
		    int flag = 0;
		    for(int j = 0 ; j< n-i-1 ; j++){//skip already sorted largest element
		       if(arr[j]>arr[j+1]){
		           int temp = arr[j];
		           arr[j] = arr[j+1];
		           arr[j+1]=temp;
		           flag = 1;
		       } 
            }
        if(flag==0){
		           break;
		       }
		
	}
	System.out.println("The sorted array is  : ");
		for(int k = 0 ; k< n ; k++){
		    System.out.print(arr[k]+" ");
		}
}
}



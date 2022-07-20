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
        int i , j, small;
        for(i=0 ; i<n-1 ; i++){
            small = i;
            for(j=i+1; j<n ; j++){
                if(arr[j]<arr[small]){
                    small = j;
                }

               
            }
               int temp = arr[small];
               arr[small] = arr[i];
               arr[i]=temp;
        }
	System.out.println("The sorted array is  : ");
		for(int k = 0 ; k< n ; k++){
		    System.out.print(arr[k]+" ");
		}
}
}




import java.util.*;


public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the Array Size: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the Array elements: ");
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		}
		System.out.println("Entered Array is : ");
		for(int i = 0 ; i < n ; i++){
		    System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		System.out.println("The max element is: "+arr[n-1]);
		for(int j =n-2 ; j>=0;j--){
		    if(arr[j]!=arr[n-1]){
		        System.out.println("Second Max element: "+arr[j]);
		        break;
		    }
		}
	}
}

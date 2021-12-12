// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size ; i++)
        {
            arr[i]=sc.nextInt();
        }
       System.out.println("no of Distinct elements "+ Distinct_count(arr,size)); 
        
    }
    public static int Distinct_count(int[] arr , int n)
    {
        Arrays.sort(arr);
        int dis = 0;
        for(int i=0; i<n;i++){
            while(i<n-1 && arr[i]==arr[i+1]){
                i++;
            }
            dis++;
        }
        return dis;
    }
    
}

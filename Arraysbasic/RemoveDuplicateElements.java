// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size ; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int size1 = remDup(arr,size);
        for(int i=0; i<size1 ;i++)
        {
            System.out.print(arr[i] + " ");
        }
        
    }
    public static int remDup(int[] arr , int n)
    {
        if(n==0 || n==1)
            return n;
        int j = 0;
        for(int i=0; i<n-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j++]=arr[i];
            }
        }
        arr[j++] = arr[n-1];
        return j;
    }
}

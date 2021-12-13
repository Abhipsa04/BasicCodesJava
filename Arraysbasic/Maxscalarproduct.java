import java.util.*;
  
 class Main
{
      static void sort_asc(int arr[], int d)
   {
           int i,j;
             for (i = 0; i < d; ++i)
        {
               for (j = i + 1; j < d; ++j)
            {
                  if (arr[i] < arr[j])
               {
                    int a = arr[i];
                     arr[i] = arr[j];
                      arr[j] = a ;
                   
               }
            }
        }
     
   }

                    public static void main(String[] args)
    {
                      
                      Scanner sc = new Scanner(System.in);
                       System.out.print("Enter the number of elements of the arrays : ");
                       int m = sc.nextInt();
                         int[] arr1 = new int[m];
                          int[] arr2 = new int[m];
                        System.out.print("Input the element of array 1 :");
                           int i;
                        for(i = 0; i < m ; i++)
        {
                         arr1[i] = sc.nextInt();
}
                         System.out.print("Input the element of array 2 :");
                         for(i = 0; i < m ; i++)
           {
                             arr2[i] = sc.nextInt();
        }
                             sort_asc(arr1, m);
                              sort_asc(arr2,m);
                            int sum = 0;
                       for(i = 0; i < m ; i++)
             {
                    sum = sum + (arr1[i] * arr2[i]);
       }
                     System.out.println("Maximum Scalar Product : " + sum);
   }
}

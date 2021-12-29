class Solution
{
    public static void sort012(int a[], int n)
    {
        

    int lo , mid , hi;
    lo = 0;
    mid = 0;
    hi = n-1;
    while(mid<=hi){// this while condition is cruical mid<=high
       switch(a[mid]){
           case 0 :{
               int temp = a[lo];
               a[lo]=a[mid];
               a[mid]=temp;
               lo++;
               mid++;
               break;
           }
           case 1:
            mid++;
            break;
           case 2:{
              int temp = a[mid];
               a[mid]=a[hi];
               a[hi]=temp;
               
               hi--;
               break;
           }
           
       }
    }
    
}// code here 
    }

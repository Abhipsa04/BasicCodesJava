class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
       /* int[] left = new int[n];
        int[] right = new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(arr[i],left[i-1]);
        }
        right[n-1]=arr[n-1];
        for(int i = n-2 ; i>=0;i--){
            right[i]=Math.max(arr[i],right[i+1]);
        }
        long rain =0;
        for(int i=0;i<n;i++){
            rain+=(Math.min(left[i],right[i])-arr[i]);
        }
        return rain;*/
         // initialize output
        long result = 0;

        // maximum element on left and right
        int left_max = 0, right_max = 0;

        // indices to traverse the array
        int lo = 0, hi = n - 1;

        while (lo <= hi) {
            if (arr[lo] < arr[hi]) {
                if (arr[lo] > left_max)

                    // update max in left
                    left_max = arr[lo];
                else

                    // water on curr element =
                    // max - curr
                    result += left_max - arr[lo];
                lo++;
            }
            else {
                if (arr[hi] > right_max)

                    // update right maximum
                    right_max = arr[hi];

                else
                    result += right_max - arr[hi];
                hi--;
            }
        }

        return result;
    } 
}

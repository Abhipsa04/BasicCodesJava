class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        long pre[] = new long[n];// creating the prefix sum array
        pre[0]=arr[0];
        for(int i =1; i<n;i++){
            pre[i]=pre[i-1]+arr[i];
        }
      if(n==1){
          return 1;// if only one element return 1
      }
      for(int i =1; i<n; i++){
          if(pre[i]==(pre[n-1]-pre[i-1])){ // pre[i] = sum of 0 to i
              return i+1;                  // pre[n-1]-pre[i-1] = sum of i to n if same
              // returning position that is index + 1
          }
          else // if not same continue the loop check for the next index if it is equilibrium point
           continue;
      }
      return -1;// if no such element found return -1
        // Your code here
    }
        // Your code here
    }

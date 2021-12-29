class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {   Set<Integer> hs = new HashSet<Integer>();// creating new hashset
        int[] pre = new int[n];// creating prefix sum array
        pre[0] = arr[0];
        for(int i= 1 ; i<n ; i++){
            pre[i] = pre[i-1] + arr[i];
        }
        //Your code here
        for(int i =0 ; i< n; i++)
        {
            if(arr[i]==0 || pre[i]==0 || hs.contains(pre[i]))// if array element is 0
            // or prefix sum is 0 or prefix sum is already present in hashset means it repeats
            // then return true
            {
                return true;
            }
            else // else add the prefix sum of that index into hashset for further checking
              hs.add(pre[i]);
        }
        return false;// if no 0 sum found then return false
          
        }
        
    }

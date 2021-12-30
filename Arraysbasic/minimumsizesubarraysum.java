class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0,end=1;
        int n = nums.length;
        int res=Integer.MAX_VALUE;
        int sum = nums[start];
        if(sum>=target)
            return 1;
        if(end<n)
            sum+=nums[end];
        while(start<n && end<n){
            if(sum>=target){
                res = Math.min(res,end-start+1);
                sum-=nums[start];
                start++;
            }
            else{
                end++;
                if(end<n){
                    sum+=nums[end];
                }
            } 
        }
        if(res==Integer.MAX_VALUE)
         return 0;
        else
         return res;
    }
}

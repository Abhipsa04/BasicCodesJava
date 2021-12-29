class Solution {
    public int maxSubArray(int[] nums) {
        int maxtill = nums[0];
        int curmax = nums[0];
        for(int i=1;i<nums.length;i++){
            curmax=Math.max(nums[i],curmax+nums[i]);
            maxtill = Math.max(curmax,maxtill);
        }
         return maxtill;
        
    }
}

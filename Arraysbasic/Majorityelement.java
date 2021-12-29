class Solution {
    public int majorityElement(int[] nums) {
        int count =1;
        int ansIndex = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[ansIndex])
                count++;
            
            else if(count==0){
                ansIndex = i;
                count =1;
            }
            else
                count--;
        }
        return nums[ansIndex];
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int maxEndHere = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            maxEndHere = Math.max(nums[i],maxEndHere+nums[i]);
            max = Math.max(max,maxEndHere);
        }
        return max;
    }
}
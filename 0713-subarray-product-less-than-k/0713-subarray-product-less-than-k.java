class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product = 1;
        int start  = 0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            product *= nums[i];
            while(start< nums.length && product >= k){
                product = product/nums[start];
                start++;
            }
            count += i-start+1;

        }
        return count;
    }
}
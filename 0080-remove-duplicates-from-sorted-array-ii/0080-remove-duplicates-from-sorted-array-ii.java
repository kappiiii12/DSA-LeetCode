class Solution {
    public int removeDuplicates(int[] nums) {
        int p = 2;
        for(int i=2;i<nums.length;i++){
            if(nums[i] != nums[p-2]){
                int temp = nums[i];
                nums[i] = nums[p];
                nums[p] = temp;
                p++; 
            }
            
        }
        return p;
    }
}
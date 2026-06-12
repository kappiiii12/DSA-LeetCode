class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0 ; 
        
        for(int i=1;i<nums.length;i++){
             if(nums[i] != nums[slow]){
               
                int temp = nums[slow+1];
                nums[slow+1] = nums[i];
                nums[i] = temp;
                 slow++;
             }
        }
        return slow+1;
    }
}
//stick on the val and find for mismatched value and swap then stick to next val

class Solution {
    public int removeElement(int[] nums, int val) {
        int pointer = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                int temp = nums[i];
                nums[i] = nums[pointer];
                nums[pointer] = temp;
                pointer++;
            }
           
        }
        return pointer;
    }
}
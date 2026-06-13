class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        
        for(int i=0;i<nums.length;i++){
           while(even<nums.length && nums[even]%2 ==0) even+=2;
             if(even<nums.length && nums[i]%2 == 0 && i%2!=0){
                int temp = nums[i];
                nums[i] = nums[even];
                nums[even] = temp;
                even+=2;
            }
           
        }
        return nums;
    }
}
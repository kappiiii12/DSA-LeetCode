class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = k;
        int max = Integer.MIN_VALUE ;
        int start = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0) count--;
          
            while(count < 0){
                if(nums[start]==0) count++;
                start++;
            }
             max= Math.max(max,i-start+1);
        }
        return max;
    }
}
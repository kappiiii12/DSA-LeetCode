class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int start = i+1;
            int end = n-1;
            int sum = 0;

            while(start < end){
                sum = nums[i] + nums[start] + nums[end] ;
                int diff = Math.abs(sum-target);
              //  System.out.print(" "+nums[i] + nums[start] + nums[end] +" "+diff+" ");
                if(sum == target) return target;
                else if(sum < target) start++;
                else end--;
                if(diff< minDiff){
                minDiff = diff;
                res = sum;
            }
                  }
        }
        return res;
    }
}
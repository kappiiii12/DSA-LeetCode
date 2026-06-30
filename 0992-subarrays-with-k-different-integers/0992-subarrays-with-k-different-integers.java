class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       
        return atMost(nums,k)-atMost(nums,k-1);
    }
    public int atMost(int[] nums, int k){
          int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int start = 0;

        for(int i=0;i<nums.length;i++){

            if(!map.containsKey(nums[i])) map.put(nums[i],0);
            map.put(nums[i],map.get(nums[i])+1);

            while(map.size() > k){
                
                map.put(nums[start],map.get(nums[start])-1);
                if(map.get(nums[start])==0) map.remove(nums[start]);
                start++;
            }
         count += i-start+1;
        }
        return count;
    }
}
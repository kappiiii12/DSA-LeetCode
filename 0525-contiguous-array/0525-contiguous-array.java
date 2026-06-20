class Solution {
    public int findMaxLength(int[] nums) {
        int sum = 0;
        int max = -1;
        
        HashMap<Integer,Integer> map = new HashMap<>();
       map.put(0,-1);
        for(int i=0;i<nums.length;i++){
           if(nums[i] == 1) sum+=1;
           else sum-=1;

            if(map.containsKey(sum)){
                max = Math.max(i-map.get(sum),max);
            }
            else map.put(sum,i);
            
        }
        if(max<0) return 0;
        return max;
    }
}
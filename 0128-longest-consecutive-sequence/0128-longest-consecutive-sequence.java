class Solution {
    public int longestConsecutive(int[] nums) {
      
        int max = 0;
      
         HashSet<Integer> set = new HashSet<>();

         for(int x : nums) set.add(x);
         for(int x:set){
            if(!set.contains(x-1)) { int currNum = x; int currStreak = 1;
            while(set.contains(currNum+1)) {currNum += 1; currStreak +=1 ;}

            max = Math.max(max,currStreak);
         }}
         return max;
    }
}
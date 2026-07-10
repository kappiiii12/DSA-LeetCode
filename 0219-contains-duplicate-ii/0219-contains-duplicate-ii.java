class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k>=nums.length) k = nums.length-1;
        HashSet<Integer> map = new HashSet<>();

        for(int i=0 ; i<=k ; i++) {
            int n = nums[i];
            if(!map.contains(n)) map.add(n);
            else return true;
            
        }
        for(int i=k+1;i<nums.length;i++){
            int m = nums[i-k-1];
            map.remove(m);
            System.out.print(m+" ");
            int n = nums[i];
            if(!map.contains(n)) map.add(n);
            else return true;
           
        }
        return false;
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
       for(int i : nums1) set.add(i); 
       for(int i : nums2) {
        if(set.contains(i)) res.add(i);
       } 
       int[] result = new int[res.size()];
        int index = 0;
        for (int num : res) {
            result[index++] = num;
        }
        
        return result;
    }
}
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
         
         for(int x : nums1) list1.add(x);
         for(int x : nums2){
            if(list1.contains(x)){
                list2.add(x);
                list1.remove(Integer.valueOf(x));
            }
         }

      return list2.stream().mapToInt(Integer::intValue).toArray();
     }
}
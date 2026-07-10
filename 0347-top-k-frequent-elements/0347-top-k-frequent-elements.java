class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[k];
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
           if(!map.containsKey(n)) map.put(n,0);
           map.put(n,map.get(n)+1);
        }
        map = map.entrySet().stream()
                 .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                 .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (e1,e2)->e1,
                    LinkedHashMap::new
                 ));
      int i =0;

      for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        if(i==k) break;
        res[i] = entry.getKey();
        i++;
      }
      return res;
    }
}
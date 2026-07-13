class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map1 = new HashMap<>(); 
        HashMap<String,Integer> map2 = new HashMap<>(); 
        List<String> res = new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            String key = list1[i];
            if(!map1.containsKey(key))  map1.put(key,i);
             }
         for(int i=0;i<list2.length;i++){
            String key = list2[i];
            if(!map2.containsKey(key))  map2.put(key,i);
             }
             int min = Integer.MAX_VALUE;
       for(Map.Entry<String,Integer> entry : map1.entrySet()){
        String key = entry.getKey();
        int value = entry.getValue();
            if(map2.containsKey(key)){
                min = Math.min(min,value+map2.get(key));
            }
       }
       System.out.println(min);
        for(Map.Entry<String,Integer> entry : map1.entrySet()){
            if(entry.getValue()+ map2.getOrDefault(entry.getKey(),Integer.MIN_VALUE) == min) res.add(entry.getKey());
        }
        return res.toArray(new String[0]);
    }
}
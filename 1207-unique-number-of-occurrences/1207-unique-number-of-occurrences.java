class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            if(!map.containsKey(i)) map.put(i,0);
            map.put(i,map.get(i)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(set.contains(entry.getValue())) return false;
            set.add(entry.getValue());
        }
        return true;
    }
}
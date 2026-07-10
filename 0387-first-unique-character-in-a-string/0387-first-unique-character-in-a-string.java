class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char c : s.toCharArray()){
            if(!map.containsKey(c)) map.put(c,0);
            map.put(c,map.get(c)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()==1) return s.indexOf(entry.getKey());
        }
        return -1;
    }
}